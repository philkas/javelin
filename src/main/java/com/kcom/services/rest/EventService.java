package com.kcom.services.rest;

import com.kcom.backend.datamodel.DbPersistor;
import com.kcom.backend.datamodel.Event;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by pika on 09.11.14.
 */
@Path("event")
public class EventService {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createEvent(JSONObject jsonObject) {
        Event event = new Event();
        try {
            event.setEventName(jsonObject.getString("eventName"));
            event.setEventType(jsonObject.getString("eventType"));
            event.setStartDate(jsonObject.getString("startDate"));
            event.setEndDate(jsonObject.getString("endDate"));
            DbPersistor.doTransaction(event);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
