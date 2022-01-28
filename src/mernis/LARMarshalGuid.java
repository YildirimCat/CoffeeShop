package mernis;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.12.11.0
//
// Created by Quasar Development 
//
//----------------------------------------------------


import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.util.UUID;


public class LARMarshalGuid implements Marshal
{
    public java.lang.Object readInstance(XmlPullParser parser, java.lang.String namespace, java.lang.String name,PropertyInfo expected) throws IOException, XmlPullParserException
    {
        return UUID.fromString(parser.nextText());
    }

    public void register(SoapSerializationEnvelope cm)
    {
        cm.addMapping(cm.xsd, "guid", UUID.class, this);
    }

    public void writeInstance(XmlSerializer writer, java.lang.Object obj) throws IOException
    {
        writer.text(obj.toString());
    }
}
