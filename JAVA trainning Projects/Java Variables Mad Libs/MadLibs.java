public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Murii
  Date: 01/13/2022
  */
  	public static void main(String[] args){
      String name1 = "Prashanth";
      String name2 = "NSP";
      String adjective1 = "strong";
      String adjective2 = "great";
      String adjective3 = "kind";
      String verb1 = "walking";
      String noun1 ="vegans";
      String noun2 ="bananas";
      String noun3 ="beat";
      String noun4 = "bosses";
      String noun5 = "snow";
      String noun6 = "apes";
      String place1 = "India";
      int number = 9732; 
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
  
    }       
}