/*
Detta dokument visar hur jag namnger olika saker när jag skriver kod.
Det hjälper mig och andra som läser min kod att direkt se vad olika saker är utan
att behöva gå och se alla definitioner.
*/

//Klasser namnger jag med UpperCamelCase
public class ExampleClass {

    //Properties och fält namnger jag med '_' följt av camelCase
    private int _exampleField;

    //Metoder namnger jag med camelCase
    public void exampleMethod() {
        /*
        Jag namnger lokala variabler på samma sätt som metoder.
        Detta är inte något jag rekommenderar men det är något jag vande mig göra
        i C# där metoder namnges med UpperCamelCase. Har haft funderingar på att kanske
        börja namnge  lokala variabler med _ emellan istället för camelCase. 
        Exempel: local_variable
        */
        int localVariable = 0;

        //int local_variable = 0;
     }

 }

//Interfaces namnger jag med 'I' följt utav UpperCamelCase
public interface IExampleInterface { }