// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		
		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       ███████ ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    ███████ ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          ███-███-███    ███        █████████████");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      ███████ ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       ███████ ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         ██ ███ ████     █");
		System.out.println("║                       Valid From:     ██/██/██");
		System.out.println("║                       Card Expires:   ██/██/██");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}// PARTNER NAME: Xander
// PARTNER NAME:
// CS111 SECTION #:1258
// DATE: 2/4/26

import static org.junit.jupiter.api.DynamicTest.stream;

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname = "SPECIMEN";
		String name = "TEST V";
		String uscis = "000-000-735     ";
		String category = "C09     ";
		String cardNum = "SRC0000000735";
		String country = "Ethiopia";
		String terms = "none";
		String dateOB = "     01 JAN 1920";
		String sex = "      M";
		String valid = "01/01/80";
		String expires = "05/10/11";
		String space1 = "				       ";



		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         UNITED STATES OF AMERICA                                     ║");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD       ║");
		System.out.println("║                       Surname                                        ║");
		System.out.println("║ \\\\\\\\\\\\\\    ///////    "+ surname + space1 + '║'); 
		System.out.println("║  .----.    .----.     Given Name                                     ║");
		System.out.println("║ (   ^  \\  /  ^   )    "+ name + "                                         " + '║');
		System.out.println("║  /     |  |     \\     USCIS#        Category   Card#                 ║");
		System.out.println("║       _/  \\_          "+ uscis + category + cardNum + "          " + '║');            
		System.out.println("║      (_    _)         Country of Birth                               ║");
		System.out.println("║   ,    `--`    ,      "+ country + "                                       " + '║');
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                           ║");
		System.out.println("║    \\          /       "+ terms + "                                           " + '║');
		System.out.println("║     '.--..--.'        Date of Birth   Sex                            ║");
		System.out.println("║       `\"\"\"\"\"`    "+ dateOB + sex + " " + "                            " + '║');
		System.out.println("║                       Valid From:     "+ valid + "                       " + '║');
		System.out.println("║                       Card Expires:   "+ expires + "                       " + '║');
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                  ║");
		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}