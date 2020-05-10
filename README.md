#Raven, Eliza's Emo Cousin
Write a program that simulates Raven, aka chat therapist Eliza's emo cousin.

* Raven will ask how you your day was much like Eliza, but she will rejoice and share in your dismay, rather than try and comfort you.

* Raven should start by asking, "Good morning, how are you feeling today?" (or any other emo equivalent)

* She should then scan the user's reply for a match on feeling words, which you need to preset when you design Raven. You would neeed to scan for both sets of feeling words.

* Feeling words can be stored in an array or arraylist:

    * String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

    * String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

* Depending on the number of matches, if there are more positive words than negative ones, Raven will reply as you imagine an emo person may reply,
"I am so happy for you...Yay..."

* But if she picks up on your bad day, Raven will be delighted and say something like,
"Really! Why, tell me more!"

* If the number of positive and the number negative words cancel each other out, she can simply say,
"Meh."

* Give the user the option to continue talking with Raven until they decided they've had enough of Raven, and press "Q" to quit. 
* Then display the chat history once the session is over.
 
DO this using Methods.
Make Raven your own and get creative!


///////////////////////////////////////////
##About The Raven Chatterbot Application
    * There are two classes in the app
        * one for main() method to start and facilitate the flow
        * the other one RavenService class is to give service to the application.
            All the data, most methods and processes, arrays and array lists are in here


##PSEUDOCODE
//RavenService Class contains the following
Arraylist to store all chat logs
random number generator
variables to low and high limits of random numbers
variables to count positive and negative words that matches with user input
String array to store positive words
String array to store negative words
String array to store next Raven request when majority of inputs are positive
String array to store next Raven request when majority of inputs are negative
String array to store next Raven request when inputs are neutral
String array to store next Raven request when user mentions important person like mom, dad ...
String array to store next Raven reply if user asks name
String array to store next Raven reply if user asks how are you 
String array to store next Raven reply if user hesitates if the app is real
String array to store next Raven reply if user enters hi
declare array to store words that are splited from user input





Start
instantiate Scanner class
instantiate The Sevice Class RavenService class
declare String variable to scan user input
prompt user to enter his feeling
scan input
    WHILE LOOP (user inputs "q")
        IF(check if user input is "bye")
            method call to end of conversation with user input
            // method call to end coversation
                add good by statement to arraylist
                print the good by statement
            break;
        ELSE
            method call to giveReply() with input parameter
            // give Reply() method
                declare and initialize temporary variable if user mentions
                    special people like mom, dad, friend, brother, sister etc
                declare and initialize integer variable to control the flow
                    IF(the array list size is zero) // that means running for the first time
                        add the first sentence already diplayed to the arraylist 
                    END IF
                convert user input to lowercase
                    FOR LOOP (index from zero to array of positive words length)
                        IF(user input contains either of the words in positive words array)
                            increament positive count
                        END IF
                    END FOR LP
                    IF(check if positive count is increamented) // it doesn't increament means 
                            //it didn't enter into previous loop
                        FOR LOOP (index from zero to array of negative words length)
                            IF(user input contains either of the words in negative words array)
                                increament negative count
                            END IF
                        END FOR LP
                    END IF                    
                    IF(length of user input is zero)    // if user just hit enter
                        reply string i donot understand
                    END IF
                    IF(user repeats the same previous sentence)
                        method call to why do you repeat method
                            IF(repeated is true)
                                increment match count
                            END IF
                    END IF
                    IF(user input requests name)
                        method call to print name
                    END IF
                    IF(user asks how are you)
                        method call to print how are you
                    END IF
                    IF(user asks if the Raven is real)
                        method call for Raven is real
                    END IF
                    IF(mactch count is zero)    // means any of the above statements are not executed
                                                // match count at this level can not be less than zero
                        split user input and store the words in teh array declared
                        FOR(index from zero to split words array length)
                            FOR(index from zero to standard greeting words array length)
                                IF(one of the member is equal to "hi")
                                    print reply to "hi"
                                    increament match count       
                                    assign outer for loop index to the maximum value to exit the next step                         
                                    assign inner for loop index to the maximum value to exit the next step                         
                                END IF
                            END FOR LP
                        END FOR LP
                    END IF
                        IF(match count is still zero)   // means if flow did not enter previous for loop for spitted words
                            declare and initialize temporary variable
                            FOR LOOP(index from zero to somebody special array length)
                                IF(user input contains any of the special people like mom, dad etc)
                                    assign current index word to temporary string variable
                                    assign index large number to get out to the loop
                                    method call to print somebody() with the current word as a parameter      
                                    increment match count by one                              
                                END IF                                
                            END FOR LP
                        END IF
                        IF(match count is less than one)    // that means zero but for if condition to function properly
                            IF(positive count is greater than negative count)
                                method call to printFromPositive                                
                            ELSE IF(positive count equals negative count)
                                method call to neutral call
                            ELSE IF(negative count is greater than positive)
                                method call to print from negative 
                            END IF
                        END IF
            scan for user input after Raven reply
        END IF
    END WHILE LP
print all logs
end


////////////////////////////////////////TEST DATA - 1/////////////////////////////////////

