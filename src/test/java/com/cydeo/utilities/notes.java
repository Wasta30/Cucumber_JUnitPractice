package com.cydeo.utilities;

public class notes {
    /*

    data driven testing : run same test against
    if u are able to run same test against different data thats called data driven testing framework ]its driven by data
    for ex in conf properties
    so u can capture the data from outside ( form some file and able to useit in ur code)

    it get data from ext file  and put it in test and get result from actual browser and return it to ext file

    how the actual flow work
    u have data file u have ur driver script and app under test , the driver get the data from the ext file and pass it to AUT and it will capture actual result from the aplictaion and the expected from the data file , the expected values are in the external file( data file )
    the expected data is already ready , either we created it or it comes from the application


    keyword drivern framework : rarely used older approach , used before , need high maintanence
    u create diff keyword , and the rest of the code is in the f
    and these keywords have anoher depository running them
    setting up framework is difficult
    u have to have obj and also keyword repository abd its one of the disadvanteg



TDD: test driven development : there is a cycle the developers write unit tst before weiting any functionality
and when the test is run it will fail because there is nothing to counterbalance it, for ex theres no google page

mvp : minium viable product : whatever is most efficient and faster , delivery sonething to user which is faster and efficient
u just simething out there and work accod to feedback
u write code it will fail u write code again ( mvp) and it will passand then u refactor and test agin etc and over time app get better  means u hire some UI , u are investing more etc
TDD : its a life cycle , for develiping an application



BDD : test are written in lang : gherkin : beh
     */

/*
UI tetsing :
parrelle testing : rather than everything executed in one driver we can say this section can be handaled by this driber and so on
for ex if u are in line of bank and only one cashier so the waiting time will be more ]
if morre cashier time will be reduced
cucumber jvm allows parallel testing : to be able to receive parallel execution we need to make thread.sleep
in junit feature file current can run in parallel like open 3 at once or 5 at once etc
so we will create multiple thread and each thread execute one feature file
what are plugins :

maven lifecycle : maven is build automation tool
instead of details how can i run diff kayers
learn how this life cycle doing





 */
/*
singelton always give one driver : and its a problem so we will modify it in order to create multiple thread to run parallel testing , we gonna evolove it
even if we create multiple thread still have one driver for example we have multiple counter but only one cvashier so we need many cashier as the cash counter
the sollutiom is we will use class called threadlocal and this allows us to create driverpool

 one thread has one driver so we use thread local which provide us driver , it creates a pool with driver in whcih we have multiple driver



 */


}
