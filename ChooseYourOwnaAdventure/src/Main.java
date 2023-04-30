import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bobby Nieves's choose your own adventure java project!");
        System.out.println("you wake up handcuffed to a metal heater you struggle but no matter how hard you try you cant break the pipes despite it looking rusted up, you hear groaning from the other room, you also catch a glimpse of a lifeless body across the room do with a backpack on its back do you look around ?(y/n)");
        System.out.println("1. look around your environment ");
        System.out.println("2. keep trying to yank at your handcuffs");


        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("you look around your environment, you notice a podium next to you is within legs reach and see a rusty set of keys on the top you kick down the podium and the keys land beside you," +
                    "you uncuff yourself and look towards the body on the ground, do you risk approaching? (3/4)");
            System.out.println("3. investigate the body ");
            System.out.println("4. look for an exit its not worth the risk");


            choice = scanner.nextInt();

        } else if (choice == 2) {
            System.out.println("you keep yanking at the handcuffs which causes alot of banging sounds from the heater pipes you're cuffed to this leads to attention being drawn to you " +
                    "and you attract a crowd of the undead which break into the room and feast on your brains GAME OVER BAD ENDING 1");
        }

        if (choice == 4) {
            System.out.println(" you try looking for an exit you find a door with a rusted lock, you try fiddling with the lock but to no avail as a last resort" +
                    "you try kicking the door multiple times it almost gives in so you give one last kick");

            System.out.println("your foot snaps in the wrong direction you fall to the ground in pain screaming the noise causes the lifeless body to reanimate and crawl towards you without you noticing");
            System.out.println("the corpse jumps on you and take a chomp out of your neck and feasts on your brains BAD END 2");


        } else if (choice == 3) {
            System.out.println("you slowly approach the body poking it with your foot it lays lifeless on the ground you roll over the body to retrieve the backpack you dig " +
                    "though the bag and see a knife and a pistol with 3 bullets not inside the magazine yet");

            System.out.println("the lifeless body growls and reanimates right before your eyes you try talking some sense into him but he doesnt listen");
            System.out.println("blood on his teeth and nails you don't see this going anywhere, hes about to charge you have to make a move now.");

            System.out.println("5. shoot it");
            System.out.println("6. knife him");

            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("you try to make some distance between him and you and aim for his head and pull the trigger");
                System.out.println("click click");
                System.out.println("you quickly realize the gun wasn't loaded with the bullets you found in the backpack this allows the reanimated corpse to have enough time to");
                System.out.println("jump on you and sink its teeth into your jugular ripping out your throat, you fall to the ground and it feasts on your brains GAME OVER BAD END #3");


            } else if (choice == 6) {
                System.out.println("you remember what you were taught and move quick");
                System.out.println("you get some distance between the living corpse and bait him into charging into you");
                System.out.println("you take the opportunity to stomp his knee sideways which leads him to fall to the ground");
                System.out.println("you hurry up and charge towards the corpse with your knife and sink it into its skull killing it successfully");
                System.out.println("you let out a sigh of relief and dust yourself off");
                System.out.println(" brushing yourself off you load the 3 bullets into your newly found pistol's cylinder ");

                System.out.println("you head over to the nearest door and it appears that theres a rusty you try fiddling with it and to no avail it doesnt give");
                System.out.println("you grab your pistol and aim it towards the lock and pull the trigger");
                System.out.println("the lock breaks clean off opening and you're able to go through the door ");
                System.out.println("you quickly take cover as you see a much more mutated version of the undead, they look much more beefy and stronger than anything you've seen before " +
                        "you could take a chance and seeing if you can pick them off with some well placed headshots ");

                System.out.println("do you test your marksman skills find another way");

                System.out.println("7. try looking for another way through");
                System.out.println("8. pick them off with some well placed shots");

                choice = scanner.nextInt();


            }  if (choice == 7) {
                    System.out.println("you get up and trip over a brick you get up and brush yourself off and think to yourself the brick can be helpful and you put it in" +
                            "your backpack, you find a propane tank and give it a light smack,");
                    System.out.println("looks like its still full its pretty heavy though you look around some more and see a barricaded door shooting it wont get anywhere");
                    System.out.println("you roll the propane tank next to the barricade, you hurry back to cover you still need to figure out how to deal with those meatheads");


                    System.out.println("9. open fire");

                    System.out.println("10. kaboom");

                choice = scanner.nextInt();

            } if (choice == 10) {

                System.out.println("you grab the brick in your bag and stand back and aim towards the propane tank and toss it as hard as you can");
                System.out.println("KLING!");
                System.out.println("the loud noise attracts the beefy undead and they charge towards the noise with no hesitation");
                System.out.println("nows your chance");
                System.out.println("you pull out your revolver and pull the trigger at the propane tank");
                System.out.println("KABOOM");
                System.out.println("the explosion causes the undead guts to fly everywhere and the barricade degree is seen on fire in pieces in the sounding area");


                System.out.println("you pick yourself up and brush yourself off and walk towards the newly created exit");
                System.out.println("you're finally out and free, you take a deep breath of the warm summer wind");
                System.out.println("you see your motorcycle parked outside, you hop on and rev the engine riding off into the sunset");

                System.out.println("YOU SURVIVED! did you see all the bad endings?");




            } if (choice == 9) {

                System.out.println("you get out of cover and stand up, they see you and make their way towards you");
                System.out.println("taking a deep breath you aim down the iron sight and take your first shot");

                System.out.println("better make them count");
                System.out.println("pulling the trigger the bullets do absolutely nothing to them quickly pulling the trigger again out of sheer panic the bullet deflects");
                System.out.println("you quickly realize that theres a place of harden skin thats deflecting the bullets");
                System.out.println("it charges at you and you grab your knife and try to sink it into their head but your blade snaps in half");
                System.out.println("they tackle you to the ground and stand up, putting your torso as leverage they grab both of your arms pulling them clean off");
                System.out.println("stomping on your torso again breaking all your ribs");
                System.out.println("grabbing your face from your jaw and ripping your head into two");
                System.out.println("GAME OVER BAD END #4");


                    ;

                              }
                        }
                    }
                }





