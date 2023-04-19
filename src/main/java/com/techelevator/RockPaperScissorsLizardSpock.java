package com.techelevator;

import java.util.Random;
import java.util.Scanner;

// Based off YouTube tutorial: https://www.youtube.com/watch?v=DyqMglmrido

public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String[] rps = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("");
                System.out.println("Please enter your move (Rock 🪨? Paper 📄? Scissors ✂? Lizard 🦎!? Spock 🖖!?!?: ");
                playerMove = scanner.nextLine();
                if (playerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Paper") ||
                        playerMove.equalsIgnoreCase("Scissors") || playerMove.equalsIgnoreCase("Lizard")
                        || playerMove.equalsIgnoreCase("Spock")) {
                    break;
                }
                System.out.println("⁉ Hmm... " + playerMove + " is not a rock 🪨, a paper 📄, a scissor ✂, a lizard 🦎, or Spock 🖖... try again!");
            }

            System.out.println("");
            System.out.println("👤 You chose: " + playerMove);
            System.out.println("💻 Computer chose: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("");
                System.out.println("✨ You 👤 and the computer 💻 both chose " + playerMove + ". That's a TIE! ✨");

            } else if (playerMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("");
                    System.out.println("🙁 Sorry, you got paper'ed! 📄 > 🪨 Computer wins. 🙁");
                } else if (computerMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("");
                    System.out.println("✨ You rocked! 🪨 > ✂ And you win! ✨");
                } else if (computerMove.equalsIgnoreCase("Lizard")) {
                    System.out.println("");
                    System.out.println("✨ Your rock 🪨 has crushed the lizard! 🦎 ...Kinda gross and mean but you won! ✨");
                } else if (computerMove.equalsIgnoreCase("Spock")) {
                    System.out.println("");
                    System.out.println("🙁 Your rock 🪨 has been vaporized by Spock 🖖! Unfortunately, you can't win like that. 🙁");
                }

            } else if (playerMove.equalsIgnoreCase("Paper")) {
                if (computerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("");
                    System.out.println("✨ You paper'ed 📄 the computer's rock 🪨! You're a winner! ✨");
                } else if (computerMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("");
                    System.out.println("🙁 Sorry, computer's scissors ✂ have destroyed your paper 📄. You lose. 🙁");
                } else if (computerMove.equalsIgnoreCase("Lizard")) {
                    System.out.println("");
                    System.out.println("🙁 Wow, the lizard 🦎 ate your paper 📄 in one bite! Sorry!  🙁");
                } else if (computerMove.equalsIgnoreCase("Spock")) {
                    System.out.println("");
                    System.out.println("✨ Your scientific paper 📄 has disproven Spock's 🖖 theory... AKA you win! ✨");
                }

            } else if (playerMove.equalsIgnoreCase("Scissors")) {
                if (computerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("");
                    System.out.println("✨ Your scissors ✂ cut the computer's paper 📄 so you win! ✨");
                } else if (computerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("");
                    System.out.println("🙁 You lose... rock 🪨 crushes scissors ✂. 🙁");
                } else if (computerMove.equalsIgnoreCase("Lizard")) {
                    System.out.println("");
                    System.out.println("✨ Your scissors ✂ decapitated the lizard 🦎! That's very gross but you won! ✨");
                } else if (computerMove.equalsIgnoreCase("Spock")) {
                    System.out.println("");
                    System.out.println("🙁 Dang, Spock 🖖 smashed your scissors ✂! That's a loss. 🙁");
                }

            } else if (playerMove.equalsIgnoreCase("Lizard")) {
                if (computerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("");
                    System.out.println("🙁 Ouch! The imaginary rock 🪨 crushed your imaginary lizard 🦎! You lose. 🙁");
                } else if (computerMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("");
                    System.out.println("🙁 This is bad... scissors ✂ have pretend decapitated your lizard 🦎. Computer wins. 🙁");
                } else if (computerMove.equalsIgnoreCase("Spock")) {
                    System.out.println("");
                    System.out.println("✨ Spock 🖖 has been poisoned 💀 by your lizard 🦎! You're a winner! ✨");
                } else if (computerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("");
                    System.out.println("✨ Hey, good idea! Your lizard 🦎 ate the paper 📄 and now you've won! ✨");
                }
            } else if (playerMove.equalsIgnoreCase("Spock")) {
                if (computerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("");
                    System.out.println("✨ Pretty cool... Spock 🖖 vaporized the computer's rock 🪨! You win! ✨");
                } else if (computerMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("");
                    System.out.println("✨ Nice! Spock 🖖 smashed the scissors ✂... you're a winner! ✨");
                } else if (computerMove.equalsIgnoreCase("Lizard")) {
                    System.out.println("");
                    System.out.println("🙁 Uh oh, Spock's 🖖 been poisoned 💀 by the lizard 🦎. That's a loss. 🙁");
                } else if (computerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("");
                    System.out.println("🙁 Sorrrrry, the computer's scientific paper 📄 disproved Spock's 🖖 published theory. You lose. 🙁");
                }
            }
            System.out.println("");
            System.out.println("Would you like to play again? (👍 yes / no 👎)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}


