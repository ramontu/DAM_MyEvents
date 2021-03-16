package dam.agamers.gtidic.udl.myenvents.models;

import java.util.Date;

public class Event {
    String name;
    String description;
    Date start;
    Date end;

    public Event() {
        this.name = "";
        this.description = "";
        this.start = new Date();
        this.end = new Date();
    }

    public Event(String name, String description, Date start, Date end) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int dies_per_acabar() {
        Date avui = new Date();
        final int HORA = 60*60*1000;
        return (int) ((this.end.getTime() - avui.getTime() + HORA) / (24 * HORA));
    }

    public int dies_per_començar() {
        Date avui = new Date();
        final int HORA = 60*60*1000;
        return (int) ((this.start.getTime() - avui.getTime() + HORA) / (24 * HORA));
    }


    public int dies_que_dura() {
        Date avui = new Date();
        final int HORA = 60*60*1000;
        return (int) ((this.end.getTime() - this.start.getTime() + HORA) / (24 * HORA));
    }

    public EventEstat getEstat() {
        if (dies_per_començar() > 0){
            return EventEstat.NOU;
        }
        else if (dies_per_acabar() > 0){
            return  EventEstat.EN_PROGRÉS;
        }

        return  EventEstat.ACABAT;

    }
}
