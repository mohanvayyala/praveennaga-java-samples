package com.praveennaga.xmlparsers;

import java.io.FileReader;
import java.io.FileWriter;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Staxparser {
	public static final void StaxSplitFileParser() {
   	 try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader =
            factory.createXMLEventReader(
               new FileReader("orders.xml"));
            FileWriter fw;
            int count=0;
            int orderPerBatch=0;
            int MAX_SIZE=2;

               while(eventReader.hasNext()){
            	   orderPerBatch++;
            	   fw=new FileWriter("orders_part"+count+".xml",true);
                  XMLEvent event = eventReader.nextEvent();
                  switch(event.getEventType()){
                     case XMLStreamConstants.START_ELEMENT:
                   	  StartElement startElement = event.asStartElement();
                   	fw.write(startElement.toString());
                         break;
                     case XMLStreamConstants.CHARACTERS:
                   	  Characters characters = event.asCharacters();
                    	fw.write(characters.getData());
                   	  break;
                     case  XMLStreamConstants.END_ELEMENT:
                         EndElement endElement = event.asEndElement();
                         fw.write(endElement.toString());
                         break;
                   }	
                  
                  if(orderPerBatch==MAX_SIZE){
                	  System.out.println(orderPerBatch);
                	  count++;
                	  orderPerBatch=0;
                  }
                  System.out.println(orderPerBatch);
                  }
   	 }catch(Exception e){
   		 
   	 }
      
   }
	 public static void main(String[] args) throws Exception {
//       DOMExample();
//       StaxExample();
   	StaxSplitFileParser();
   	
  /*  XMLInputFactory xif = XMLInputFactory.newInstance();
    XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("orders.xml"));
    xsr.nextTag(); // Advance to statements element

    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer t = tf.newTransformer();
    FileWriter file=null;
    while(xsr.nextTag() == XMLStreamConstants.START_ELEMENT) {
    	 file = new FileWriter(xsr.getAttributeValue(null, "order") + ".xml",true);
        t.transform(new StAXSource(xsr), new StreamResult(file));
    }
}*/

   }
}


