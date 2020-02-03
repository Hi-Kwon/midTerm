package midTerm;

import java.util.ArrayList;
import java.util.Scanner;

import midTerm.character;

public class mainGame
	{
		static int newGoblinHealth = 0;
		static Scanner myScanner = new Scanner(System.in);
		static ArrayList <character> chooseCharacter1 = new ArrayList <character>();
		static ArrayList <enemies> chooseCharacter2 = new ArrayList <enemies>();
		public static void main(String[] args)
		{
			roles();
			enemies();
			mainGame();
		}
		public static void roles()
		{
			chooseCharacter1.add(new character(1, "Swordsman", " Sword ", 18 , 9));
			chooseCharacter1.add(new character(2, "Mage", " Staff ", 10 , 11));
			chooseCharacter1.add(new character(3, "Tank", " axe ", 25 , 5));
			chooseCharacter1.add(new character(4, "Archer", " bow ", 14 , 9));
		}
		public static void enemies()
		{
			chooseCharacter2.add(new enemies("Guard", 99999999, 9999999));
			chooseCharacter2.add(new enemies("Slime", 5, 1));
			chooseCharacter2.add(new enemies("Goblin", 20, 5));
			chooseCharacter2.add(new enemies("Demon", 99999999, 9999999));
			
		}
		public static void mainGame()
		{
			for(character c: chooseCharacter1)
				{
					System.out.println(c.getOption() + " " + c.getRole() + c.getWeapons() + c.getHealth() + " Hp " + c.getDamage() + " Damage");
				}
			Scanner decision = new Scanner(System.in);
			System.out.print(" ");
			System.out.print("What would you like to be? ");
			int option = myScanner.nextInt();
			
			if(option == 1)
				{
					System.out.println("You have chosen Swordsman.");
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------------------------------::::--------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------------------------------------------------:/+oosoosyhhyo/::----:----------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------------------------------::--:-:/+syyo+/::://osyyys+:-------------------------------------------------------------------------------------\r\n" + 
							"-----------------------------------------------------------------------------------------:-:+syhs+:::-:::----::/+os/:-----------------------------------------------------------------------------------\r\n" + 
							"----------------------------------------------------------------------------------------::oyhhs/:-::------------:-+s/-----------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------------------------------/shhhs/:------------------:-//:----------------------------------------------------------------------------------\r\n" + 
							"-------------------------------------------------------------------------------------:sddhs/------------------------------------------------------------------------------------------------------------\r\n" + 
							"-----------------------------------------------------------------------------------:ohhhy+--------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------:-:odhho/---------------------------------------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------------------------:oddh+:----------------------------------------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------------------------/yNh+--:---------------------------------------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------------------------omh+-------------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------/hh+-----:--------------------------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------------+s+-----:--:------------------------------------------------------------------------------------------------------------\r\n" + 
							"-------------------------------------------------------------------------------://::--------------------------------------------------------------------------------------------------------------------\r\n" + 
							"----------------------------------------------------------------------::-------:+/:---:--::::::::::::------::-------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------:---------::syoooosssyyhhhhyhhhyso+/:-----------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------------::/oydmmhhyyyyhhhdddhhhhddhddho:--:-------------------------------------------------------------------------------------------\r\n" + 
							"-----------------------------------------------------------------------:/syhdmmddddhhyooyhhhdddddhhdddhdhs:---------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------------------:/ohdddNNmddmmddhhhyyyhhhdhhhhhhhhhhhh+--:------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------------------:+sdmmdNNNNmdmmmmdhhhhhhhhhhhhhhhhhhhhhy/:--------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------------:----/ohhhhhhmmNmddmNNmmdddhhhhhyyhhhhhhhhhhyo--:-------------------------------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------------------:/oyyssyyymNNNmdmNNmmmdddhhhhhhhyyhhhhhyyo:----------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------:------::/ohdmmNNmNNmmmmmmmmmmmmddddddhhhhhhhhhyo+:-----------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------------/+/:/+ooosdmmNmmmmmmmmmNNNNNmdhhhhhhhhyys+:-----::------------------------------------------------------------------------------------------\r\n" + 
							"----------------------------------------------------:--:--/+o+/+shdddhyyhmNNNmmmNNNNmmddhhhhhhhhhyo/:------::-------------------------------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------:/hy::/+ooo+/+oosyhNNmddNNNNNNNmmdddddddhhhhhdddyo+/:-------------------------------------------------------------------------------------------------\r\n" + 
							"-------------------------------------------------::sNNoooooo+//osssydmNmmNmmmmdddddddhdhdhhhhddhmNNNNds-------------------------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------------:/+dmdoosoo+sssyyysydhmmmhyyyydddhddhyyysyyyydhhdmNmmmd+------------------------------------------------------------------------------------------------\r\n" + 
							"-----------------------------------------------:odmmmdyssyyss//oss/--::/:::/oydNmdmmdddyyysyddyyhdmmdmmds/--:-------:::---------------------------------------------------------------------------------\r\n" + 
							"------------------------------------------::--:ohhmmmmhhhy/:--------------/ymNNNmdhhhhhys+oddyyddmmmmmmmmd+:------::::::::::----------------------------------------------------------------------------\r\n" + 
							"----------------------------------:--:-----:-/shhhdmmmmmmy/:------------/sdmNNNmmmmdyyyyyhmdyhhmmmmmmmmNmmddhs+/::::::::::::--:-------------------------------------------------------------------------\r\n" + 
							"----------------------------------:-------::+hdddddmmmmmNNo:-----::/oosymNmmmmNNNNNmmmmmddhdmNmmmmmmmmmmmmmddhhhyso+/:::::::::--------------------------------------------------------------------------\r\n" + 
							"-----------------------------------:--::::/shdddddddmNmNdo:---:+shdmmmmNNNmmmmmmdmmNNNmmdhdmNNNNmmNNmmNNmhyyyyhyyhhhhyyo+::::-::------------------------------------------------------------------------\r\n" + 
							"-------------------------------------:--:ohddmmdmmdmmNMy:---:+hmddmmmdmMmmmdmmmhyyhddmdyydmmNNNNNdhhdmdhyyyyyyyyyyhhhhhhyo::::-::-----------------------------------------------------------------------\r\n" + 
							"--------------------------------------/shdmmmmdmmmmmNNo/+osydNmmmmmNmmmmNNNNmmhysssosssymmNmmNNNmNNmdhhhyyyyyysyyyyyhhhhhyo::::::-----------------------------------------------------------------------\r\n" + 
							"---------------------------------:::+ydddmmmmmmmmmNNNhdmddmmmmmmmmmNmmNNNNNNmyysso++osymNmmmmddmdmmmhyhhhhyysyyyyyyyhhhhhhyo::::------------------------------------------------------------------------\r\n" + 
							"--------------------------------:/shdmmmmmmmmmmmmNNNmmmmmmmmmmmmmmmmmmNNmNNmhyyyo//+oshmdddddhhhhhdmhyhhhhhysyyyyyyhhhddhhhho::::-----------------------------------------------------------------------\r\n" + 
							"-------------------------------:ohdmdhdmmmmmmmmmNNNmmdmmmmmmmmmNNmmmNNNmmNmhyhhyo++osydddddddhhhhhhddhhhhhhhhyyhhhhhhhddddddh+:::-----------------------------------------------------------------------\r\n" + 
							"------------------------------:ohddmmhmmmmmmmmmmmNNmNmmmmmNmmmmNNmmmdmmmmmdhdmhsyyyhyhmmddmddhysssyhddhhdddmmhhhhhhhhhdddddddh/:::----------------------------------------------------------------------\r\n" + 
							"-----------------------------:::/ymmdmmNNmmmmNNNmNNNNmmmmmmNNmmNmmmmmNNhdddmmmhsyhdmmdddddmmmdyhhyyhdmdhdmdmNdhhhhhhhhhdddddddy:::----------------------------------------------------------------------\r\n" + 
							"--------------------------------:hNNmmmmmmmmNNNNmmNNNNmmmmmNNmmmmmmmNNmshhdmmNddhhhdmdddddmNdydmNNmddmmdmmmNMmhhddddddddddddddmo:-----------------------------------------------------------------------\r\n" + 
							"----------------------------::::+mNNNmmmmmNNNNNNmmNNNNNmmmmmNNNmNNddhdhhddmNNmmmdmmmmdddddmmdyydmmNmdmmmmmmNMNdddddddddddddddddd+:--:-------------------------------------------------------------------\r\n" + 
							"--------------------------------/ymNNNmmNNNNNNNNmNNNmNNmmmmmNNNmmmmmmmmmmmmNNdydmmmmmdddmmddddhhddmddmmNmmmNMMmdddddddddhddddddddo:--:------------------------------------------------------------------\r\n" + 
							"---------------------------------:+ymNmmNNNNNNNNNNNNNNNmmmmmNNNNmmmNNmmmmmNNNmmmNmmmmddmmmmNNNmmmddmmmNNNmmNNNmddddddmmdddddddddmmo:::------------------------------------------------------------------\r\n" + 
							"-----------------------------------:/oyddyyhhyshmNNNNNNmmmmmNNNNNmmNNNmmmmNNNmmmNNmmmdmmNmmmmmmmmmmmmmNNMNmmNMmmdddddmmmmdddddddmmdo:-:-----------------------------------------------------------------\r\n" + 
							"------------------------------------:-:::::::--/hNNNNNNNmmmmNNNNNNmNNNmNmmNNmmmmmmmmmdmmmmmmNmmmmNNmmNNNMNmmNNNmdddddmmmmmdddddmdmmds/------------------------------------------------------------------\r\n" + 
							"------------------------------------------:----:sNNmNNNNmmmmNNNNNNNNNNNNmmNNmmmmmmmmmmmmdmdmNNmddmmmmNNNMMNmNNNmddddddmmmmmmddddddmmdy/:----------------------------------------------------------------\r\n" + 
							"-----------------------------------------------:omNmmNNNNmNNNNNNNNNNNNNNmmNmNmmmmmNmmmmmmmmmmmmdddmmNNNNNMNNNNNNddddmmmmmmmmmmdddmdmmdh+:---------------------------------------------------------------\r\n" + 
							"--------------------------------------------::--/hNNmNNmNNmNNNNNNNNNNNNNNNNNNmmmmmNNmmmmmmmmmNmdddmmNNNNNNNNNNMNdddddmmmmmmmmmmhdddmdddho:--:--:--------------------------------------------------------\r\n" + 
							"-------------------------------------------:::--:sNNmNNmmNmNNNNNNNNNNNNNNNNNNmmmmNNNmmmmmmmmmmmmmmmNNNNNNNNNNNNNmddddmmmdmmmmmmmdhddmdddho:-------------------------------------------------------------\r\n" + 
							"---------------------------------------------::--:smNmmmmNNNNNNNNNNmmmNNNNNNNmmmmNNNmmmmmmmmmmmmmmmNNNNNNNNNNNNMmdddddmmdmmmmmmmmdhdmmmy+/:-------------------------------------------------------------\r\n" + 
							"-----------------------------------------------::-:/ydmmmmNNNNmNNNNmmmmNNNNNNNNmmmNNmmNNmmmmmmmmmmmNNNNNNNNNNNNMmdhdddmmmmdmmmddddddmmh+-----------:----------------------------------------------------\r\n" + 
							"----------------------------------------------------:/oyhdmNNNmNNNNNNmmNmmNNNNNNNmmNmmNmmmmmmmmmmmmNNNNNNMMNNNMMNdhhhddddddddmmmmmmhs+:----------:------:::---------------------------------------------\r\n" + 
							"----------------------------------------------------::::/+smNNNNmNNNNmmNmmNNNNNNNNNmmmNmmmmmmmmmmmmNNNmmNNNNNNMMmdddmmmmmmmNNNNNNNy/:::---------------:+o/----------------------------------------------\r\n" + 
							"----------------------------------------------------::::-:/omNNNNNNNNNmmdmNNNNNNNNNmmmmmmmmmmmmmmmmmNNmmNNNNNNNNNmmNNNNNNNNNNNNNNNNs/------------:--:/os+--:--------------------------------------------\r\n" + 
							"------------------------------------------------------::-:::ohmNNmNNNNmmdmNNNNmmNMNNmdmmmmmmmmmmmdmmNNmmNNNNNNNNNmmmNNNNNNmmmddmmmmy/:-----------:://oy+------------------------------------------------\r\n" + 
							"--------------------------------------------------------::::::+sdmNNmmmmdmNNNNmmNNMNmddmmmmmmddmmmdmmmmNNNNNNmmmmmmmNNNNNNmddddddmh+::----------://hyhyo:-----------------------------------------------\r\n" + 
							"---------------------------------------------------------::--:::/oyNNNNmmmNNNNNNNNNNmdmmmmmmmNmmNNNNNNNNNNNNNmdmysosdNNNmmmmmmmddNd+::-------:-:/+shdy+o/:----------------------------------------------\r\n" + 
							"---------------------------------------------------------------:::+dNNNNNNNNNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNmmm+:/smNNmmNmmdy++sds+/::---:---:+ysods+sy+::---------------------------------------------\r\n" + 
							"------------------------------------------------------------:-::::/hNmmNNNNNNmmNNNNNNMMNNNNNNNNmNNNmmNNNNNNNNmNy::sdNNmmmmdhhyssyhs/:::------:+hddds::+o/-----------------------------------------------\r\n" + 
							"-------------------------------------------------------------:::::/yNmmmNmmmmdhddmNNNNNNNNNmmNmdhhddmNNNNNNNNmmo/:omNmddddddmmhyddh+:::-:---:+hmmmo:--+o:-----------------------------------------------\r\n" + 
							"---------------------------------------------------------------:::omNmmhmmdmdysyhhhhdmmddddhhhdmddddmmmdddmNNmdyo:+dmmdddddddhydmms:::-----:oddmm+----/o/-----------------------------------------------\r\n" + 
							"---------------------------------------------------------------:::sNNNNmddddysoyyyhhhyyydmdyhddmmdddmmmdddmNNmddd+smNmdddhddddhmmd/-:---::/sdddd+-:---:o/-----------------------------------------------\r\n" + 
							"---------------------------------------------------------::-::::::sNmmmNNmNdmdhhddmmmNmdddmmmhdmmmmmmmmmmmmNNNmdm+sdmmddddhhdhhmms:::----:sddmh/-:-----/:-----------------------------------------------\r\n" + 
							"------------------------------------------------------:::::::::-:/yNmmmmNmmmdddddhdddmmmmmmmmmdddddmdmNNNNNNNNNmdssmmmdddhhyyhhmm/--:---/ymddy/---:-----------------------------------------------------\r\n" + 
							"-------------------------------------:::--------------::::::::-::omNmNmNNmmmhhddmmmmmmNNmmmmmmmNmdmmmmNNNNNNNNNmmhhmmmdddhhdhhdNs::--:-/hmmmy:----------------------------------------------------------\r\n" + 
							"------------------------------------::::--------------::::::::-:omNNmNmNNNmmmmmmmmmmNNmmNNNNNmmmmNNNmNNNNNNNNNNmmmmmNmmddddddhmN/::---+hmmmy:-:---------------------------------------------------------\r\n" + 
							"------------------------------------------------------:::::::::odNNmmNNmNNNNmmNNmmmNNNNNNNNNNmmmNNNmmmNNNNNNNNNNmmmNNmddddddhdNh::---oddmms:--:---------------------------------------------------------\r\n" + 
							"---------------------------------------------------:--::::::::odNNNmmNNNmmmNNNNNmdmNmmmmmmmddmmmmmmdhdmNNNmmNNNNNmNNNmmddddddmN+::-:sdmmdo:--:-:--------------------------------------------------------\r\n" + 
							"-------------------------------------------------:::---:-::::+dNNNmNNNmmmNNmmdmNmmNNmddmmmmmmdmmmmmddddmNNNNNNNNNNNNNmmdddmmdmm::-:sdmmh+:-----:--------------------------------------------------------\r\n" + 
							"-------------------------------------------------::::::--:::+dNNNmNNNNmmmNNNdhmNNNNNmddmmmmmmmmdmmmmmmmmNNNNNNNNNNNNmmmdddmmdmd-::yddmh+----------------------------------------------------------------\r\n" + 
							"-------------------------------------------------:::::-::::/hNNNNmNNNNmmmNNNmdmNNNNNNmmmmmmmmmmddmmNNmmNNNNNNNNNNNNNmmdddddddmh-:hddmh+:::-----:--------------------------------------------------------\r\n" + 
							"-------------------------------------------------:::-:::::/ymNNNmmmNNNNmNNNNNmNNNNNNNmmmmmmmmmmmmmmmNmmmNNNNNNNNNNNNmdddhhhyddm:hdhmy/------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------:::-:::smmmmmmmmNNmmNNNNNNNNNNNNNNmmmmmmmmmmmmmmmNmmmmNNNNNNNNNNmmmmmmddddmdmmmms::------------------------------------------------------------------\r\n" + 
							"----------------------------------------------------:-:::sdmmmmmmmmmmmmNNNNNNNNNNNNNNmmmNmmNmmmmmmmmmmmmmNNNNNNNNNNNNNNmmmmmmmddNNy:--------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------::/dmmNNNmmmmmmmmmNNNNNNNNNNNNNmmmmmmNmmmmmmmmmmmmmmmmNNmmmmmmmmmmdddddmdmNy:---------------------------------------------------------------------\r\n" + 
							"---------------------------------------------------:--:::+ymNNNmmmmmmmmmNNNNNNNNNNNNNmmmmmmNNmmmmmmmmmmmmmmNNNNNNmdddmmdhhhhdyomo:-:--------------------------------------------------------------------\r\n" + 
							"------------------------------------------------------::-:hmNNmmmmmmmmmmNNNNNNNNNNNNNmmmmmmNNNmmmmmmmmmmmmmmNNmNmdyssyhysso++++s/-:::-------------------------------------------------------------------\r\n" + 
							"--------------------------------------------------------:-omNNmmmmmmmmNNNNNNNNNNNNNNNNmmmmmmNNmmmmmmmdmmmmmmNNmNmysoosso/////++o:::---------------------------------------------------------------------\r\n" + 
							"----------------------------------------------------------omNNmmmmmmmmNNNNNNNNmNNNNNNNmmmmmNNNNmmmmmdddmmmmmmNNNmyooossoo+/++++s:-:::-------::::--------------------------------------------------------\r\n" + 
							"---------------------------------------------------------:smNmmmmmmmNNNNNNNNNmmmNNNNNNmmmmmmmNNmmmmmmmmmmmmmNNNNmhyyyysooo++ooy+:::-::::::::::::--------------------------------------------------------\r\n" + 
							"-----------------------------------------------------:---/dmmmmNNNNNNNNNNNNNNmmmNNNNNNmmmmmmmNNNmmNmmmNNNNNmNNNNNNmmmmmhyso+sdd/::::::::::::::::--------------------------------------------------------\r\n" + 
							"-------------------------------------------------------:-ommmmNNNNNNNNNNNNNNNNNmNNNNNNmmmmmmmNNNNNNNNmmmmNNmmmNNNNmmmNNNmddhdddy::::::::::::::::::::::::------------------------------------------------\r\n" + 
							"-------------------------------------------------------:-hmmNNNNNNNNNNNNNNNNNNmmmNNNNNNmmmmNNNNNNNmmmmmmmmmmmmNmNmhhhhdNmddhddmmo:-::::::::::::::::::::::-----------------------------------------------\r\n" + 
							"--------------------------------------------------------+mNNNNNNNNNNNNNNmmmmNmmmmNNNNNNmmmmNNNNNNNmmmmmmmmmmmmNmmdhyhhdmdddhdmmmmo:::::::::::::::::::::::::::::::---------------------------------------\r\n" + 
							"--------------------------------------------------------ymNmmNNNNmmmNNNmmmmmNNmmmNNNNNNNmmmmmNNNNNNNNmmmmmmmmmmmdhyhdddddddmmNmmdh+::::::::::::::::::::::::::::::---------------------------------------\r\n" + 
							"-----------------------------------------------------:-/mmmNNNmmmmmmNmmmmmmmNNNNmmNNNNNNNmmmmmmNmmNNNNNmmmmmmmdhyyhddddmmmmmmmmdddy/:::::::::::::::::::::::::::-----------------------------------------\r\n" + 
							"----------------------------------------------------:--smmmNNNmmmmmmmmmmmmmmNNNNmmNNNNNNNmmmmmmNmmNNNmmNNmmmmms+oydmddmNmmmmmmmddddy/-:::::::::::::::::::::::::::---------------------------------------\r\n" + 
							"---------------------------------------------------:::/mmmmNNmmmmmmmmmmmmmmNNNNNmmNNNNNNNmmmmmmmmmmNNmmNNmmmmdhhhhdddmmNmmNNmmmdmmdmy+::::::::::::::::::://:::::----------------------------------------\r\n" + 
							"---------------------------------------------------:::yNmmNNNmmmmmmmmmmmmmmNNNNNmmNNNNNNNmmmmmmmmmmNmmmmmNNmdhhddmmddmNNNNNNNmmdmmmmmdyo+//:::::::::::::::::::::-------::-------------------------------\r\n" + 
							"--------------------------------------------------:::/mmmNNNmmmmmmmmmmmmmmNNNNNNNNNNNNNNNmmmmmmmmmmmNNmmmNmhyhhdmddmmmNNNNNmmmddmmmmmmddddhhyo//:::::::::::::::::-------::::----------------------------\r\n" + 
							"-----------------------------------------:-------::::oNmNNNmmmmmmmmmmmNmmmNNNNNNNNNNNNNNNNmmmmmmmmmmmmmmmmhyyhmmmmmmmmmmmNNNNmdddmmmmmmddddddddhhysoo+++++/::::::::----:-::::---------------------------\r\n" + 
							"-----------------------------------------::------::::yNNNNNmmmmmmmNmmmNmmmNNNNNNNNNNNNNNNNmmmmmmmmmmmmmddysyydmNNNmmmmmmmmmNNmmmddmmmmmmdddddddddddddddddhhyso+/:://::---::::---------------------------\r\n" + 
							"-----------------------------------------::-----::::/mNNNNNmmmmmmNNNmmNmmmNNNNNNNNNNNNNNNNmmmmmmmmmmmmdhsossdNmNNNNNNmmmmmmmmmmmmmmmmmmmmdddddmmdmmmmmmmmmddddddhy+:::------:::-------------------------\r\n" + 
							"------------------------------------------::----:::/oNNNNNNmmmmmmNNNmmmmmmNNNNNNNNNNNNNNNNNmmmmmmmmmmmdsooohmmmmNNNNNNmmmmmmmmmmmmmdmmmmmmmmmmmmmmmmmmmmmmdddhysso/--:----------------------------------\r\n" + 
							"------------------------------------------------:::/sNNNNNNmmmmmmNNNNmmmmNNNNNNNNNNNNNNNNNNNmmmmmmdmmds++sydNmmmNNNNNNNmmmddmmmmmmmmmmdmmmmmmmmmmmmmmmmdddddhs/-----------------------------------------\r\n" + 
							"------------------------------------------------:::/odNNNNmmmmmmmNNNNmmmmNNNNNNNNNNNNNNNNNNNmmmmmmmmds+oshhmNmmmNNNNNNNNNmmmmmmmmmmmmddddddmmmmmmmmmmmdhhhhhys/-:---------------------------------------\r\n" + 
							"-----------------------------------------------::::::sMNNNNmmmmmmNNNNmmmmNNNNNNNNNNNNNNNNNNNmmmmmmmhs++syhdmmmmmNNNNNNNmNNNNmmmmmmmddddddddddmmmmmmmmdo/:////::-:---------------------------------------\r\n" + 
							"-----------------------------------------------::::::+MNNNmmmmmmmNNNNmmmmNNNNNNNNNNNNNNNNNNNNNmmmmhs++oyhdmmmmmNNNNNNNNNNNNNNmmNNmmmmmmmmddddddmmmmmd+:-------------------------------------------------\r\n" + 
							"----------------------------------------------------:/dNNNmmmmmmmmmNNNmmmNNNNNNNNNNNNNNNNNNNNNmmmhs++syhdddmmmmNNNNNNNNmmmmmmmmmmmmmmNNNmmmmddddmdddy:-::::::::-----------------------------------------\r\n" + 
							"---------------------------------------------------:::+NNNmmmmmmmmmNNmmmmNNNNNNNNNNNNNNNNNNNNNmmds+osyhdddmmmNNmmmmmNmmmmmmmmmmmmNNNmmmmNNNNmmmddddmdo/:---::::::---------------------------------------\r\n" + 
							"-------------------------------------------------------hmmmmmmmmmmmNmmmmmNNNNNNNNNNNNNNNNNNNNNNdo+osyhddmmmmmNNmdddmmmmmmmmmmmmmmNNNmmmmmmmmNNNNmmmdmmdhs+::::--:---------------------------------------\r\n" + 
							"-----------------------------------------------------::/dmmmmmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNdo+osyhdddmmmmmmmmmdddmmmmmmmmmmmmmNNNmmmmmmmmmmNNNNmmmmddmdho/:--:---------------------------------------\r\n" + 
							"------------------------------------------------------:-hmmmmmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNms++syhdddmmmmmmmmmmmdddmmmmmmmmmmmNNmmNmmmmmmmmmNNNmmmmmmmmmdddy+:----:--:--------------------------------\r\n" + 
							"------------------------------------------------------:-hmNmmmmmmmmmmmmmmNNNNNNNNNNNNNNNNNNMms++oyhddmdmmNmmmmmmmmmmmmmmmmmmmmmmmmmmNNmmmmmmmmmmmmmNmmmmmmmddmdhs/::------------------------------------\r\n" + 
							"------------------------------------------------------:-dNNNmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNms++oshddddmmmNmmmdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmNNNNmmmmmmmmmmmddddho:-----------------------------------\r\n" + 
							"-----------------------------------------------------:::mNNNmmmmmmmmmmmNNNNNNNNNNNNNNNNNNNms++osydmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmhhmNmmmmmmNNNmmmmmmmmmmmmdddds/:---------------------------------\r\n" + 
							"-------------------------------------------:::::-------/NNNNNmmmmmmmmmmmmNNNNNNNNNNNNNNNNms++osydmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdyydmmmmdhyydNmmmddmmmmmmmmdddds/:---:---------------------------\r\n" + 
							"-------------------------------------------::::::------+NNNNNmmmmmmmmmmmmmNNNNNNNNNNNNNNms++ooydmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdy+osso+////odNNmmmmdmmmmmmmddmho:-:--:-------------------------\r\n" + 
							"-------------------------------------------:::::-------oNNNNNmmmmmmmmmmmmmmmNNNNNNNNNNNms++osydmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdho/////:////sdmmmmdmmmmmmmmdmmmh+:-::-------------------------\r\n" + 
							"---------------------------------------------::-----:--yNNNNNmmmmmmmmmmmmmmmNNNNNNNNNNdy++osydmmmNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddy+/::::::::+ymNmmmmmmmmmmdddmho:::--::--::::----------------\r\n" + 
							"----------------------------------------------------:--hNNNNmmmmmmmmmmmmmmmmmNNNNNNNNds++oshdmmmNmmNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddds/::::-:::/odNmmmdmmmms////:-::-::::-::::::---------------\r\n" + 
							"----------------------------------------------------:-/mmmNmmmmmmmmmmmmmmmmmmNNNNmNNds++osymmmmmmmNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmho/::::::::+ymmmmmmdo:::------::::::::::::---------------\r\n" + 
							"----------------------------------------------------::sNNmNmmmmmmmmmmmmmmmmmNNNNNNmds++syhmmmmmmmmNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmds::::::-::/smNNmmh/::::::::::--------------------------\r\n" + 
							"----------------------------------------------------::hmmmNmmmmmmmmmmmmmmmmmmNNNNmds++oyhmmmmmmmmmNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmy/:::::::-:ohmNNmh/::::::-----------------------------\r\n" + 
							"----------------------------------------------------:/mNNNmmmmmmmmmmmmmmmmmmmmmmmds++oyhmmmmmmmmmmNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdmmmmmNmmmms::::::::::/sdmmNms/::-------------------------------\r\n" + 
							"---------------------------------------------------::sNNmmmmmmmmmmmmmmNNNmmmmmmmds++oydmmmmmmmmmmmNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdmmmmmmmmmo::::::::::::/osyhddo/:-::-----:---------------------\r\n" + 
							"--------------------------------------------------::+dmmmmNmmmmmmmmmmmNNNmmmmmmhs++oyhmmmmmmmmmmmmNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmNmso:::::::::::::::::/+oys+:::-----::--------------------\r\n" + 
							"--------------------------------------------------::smmNmmNmmmmmmmmmmmNNNmmmmmho++oyhmmmmmmmmmmmmmNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddddmm+::::::::::::::::::-:::////::-----::--------------------\r\n" + 
							"-------------------------------------------------::odmmNmmmmmmmmmmmmmNNNmmmmmho++syhmmmmmmmmmmmmmmNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddddh::::::::::::::::::::--:-::::::::::::--------------------\r\n" + 
							"-----------------::::::::------:::---------::--:-:/hNmmmNmmmmmmmmmmmmmNmNmmmho+ooydmmmmmmmmmmmmmmmmNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddddh/:::::::::::::::---------------------------------------\r\n" + 
							"-----------------:::::::::::::::::--::::::::::::::omNNmNNmmmmmmmmmmmNmNmmmmho+ooydmNNNmmmmmmmmmmmmmNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddddddy+::::::::::------------------------------------------\r\n" + 
							"-------------::::::::::::--:-:---::::::::::::::::+dNmmNmmmmmmmmmmmmmNmNNNmho+osydmmmmNmmmmmmmmmmmmmNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddddddms::::::::::------------------------------------------\r\n" + 
							"---------::::::::::::::::--::::::::::///////////+yNmmmNmmmmmmmmmmmmmmmNNNho+osydmNNmNNmmmmmmmmmmmmmNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddddddd+:::-::::::------------------------------------------\r\n" + 
							"--------::::::::::::::::::::://+++++ooooooooooosydNmmNNmmmmmmmmmmmmmmmNNh++oyhdmmmmmNmmmmmmmmmmmmmNNNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddddy:::::::::::::---------:------------------------------\r\n" + 
							"--------:::::::--:::///////++oooooooosssssssooosyddmmNNmmmmmmmmmmmmmmNmho+oyhdmmmmmmmmmmmmmmmmmmNNNNNNNNNNNNmmmmmmmmmmmNmmmmNmmmmmmmmmmmmmmmmmmddd/::::::::::::::::::::::::-----------------------------\r\n" + 
							"--------:::::::://+++oooooooooooooooooooosssssssssyhmNmmmmmmmmmmmmmmNmho+syhdmmmmmmmmmmmmmmmmmmmNNNNNNNNNNNNNmmmmmmmmmmmmmmmmNNmmmmmmmmmmmmmmmmmh+::::::::::::::::::::::::::----------------------------\r\n" + 
							"----------::::/+oooooooooooooooooooooooooossssssosymmmdmmmmmmmmmmmmmmy++shhdmmmmmmmmmmmmmmmmmmmmNNNNNNNNNNNNNmmmmmmmmmmmmmmmmNNmmmmmmmmNNmmmmdhy/:/:::::::::::///:::::::::::----------------------------\r\n" + 
							"----------::::::/++++ooooooooooooooooooooosssssssyddhddddmmmmmmmmmmho++shydmmmmmmmmmmmmmmmmmmmmmmNNNNNNNNNNNNmmmmmmmmmmmmmmmmNNNmmmmmddddhhyyysssooo///:/+++++ooo+++///:::::----------------------------\r\n" + 
							"------------:::::::::::/++ooooooooooooooossssyyhhhhhhhhhddmmddddhhy+/+syyhdddddddmmmmmmmmmmmmmmmmmmmmmmmNNNNNmmmmmmmmmmmmmmmmmmmmmmdhyyyyyyyyyyysssssoooooooooooo+//::-::-------------------------------\r\n" + 
							"----------------:--:---:::////++++++oooooossyhhhhhhhhhhhhhhhhyyyyyo/+syyyyyyhhhhyhhdmmmmmmmmmmmmmmmmmmmmmmNNNmNmmmmmmmmmmmmmmdhhhhhhyyyyyyyyyyssyssssssssssssoo+/::::::---------------------------------\r\n" + 
							"--------------------------::::::::::////+oooooosssyyyyyyyyyyyyyys+/+syyyyyyhyyhhyyyhhhhhhhhhhdddddddddmmmmmmNNmmmmmmmmmmmmmmdyyhhyyyyyyyyyyyssssssssssssssso+//::::::::---------------------------------\r\n" + 
							"----------------------------------::::--::::///++++++oooossssss+//+syyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyhhhddmmmmmmmmmmmmmmmdyyyyhyyyyyyyyyssssssssssssssso+//::::::------------------------------------\r\n" + 
							"--------------------------------------------::::::::::::://++////+syo/:////++++osssssssyyyyyyyyyyyyyyyyyyyyyhddddhhhdmmmmddhyssyyyyyyysssssssssssssssssssoo+/::::---------------------------------------\r\n" + 
							"-----------------------------------------------::::-::-:://////+oso/:---------::/+osssyyyyyssooossssssssssssyydddyoosyyhdyoooosssssssssysssssssssssssssso+/::::-----------------------------------------\r\n" + 
							"-------------------------------------------------::--:::-::///+so/:--------:::/+ossssssoo+/::::::::::://////++ohhsosssso+::://////++oooooooo++++/+++++//:::::-------------------------------------------\r\n" + 
							"---------------------------------------------------:---://+++oo+:::::--://+ooooo+///:::-----------------:----:-/oo++/:------::------:::::::::-----::::::::----------------------------------------------\r\n" + 
							"-----------------------------------------::::-:---:--:/osoo++/:--::///++++/:/:::-------::------:::::::-::------:::::------------------------------------------------------------------------------------\r\n" + 
							"-----------------------------------------:/+/:----::/+oo+/:::-::://+/::----:::::------------------------------------------------------------------------------------------------------------------------\r\n" + 
							"");
					System.out.println(" ");
				}
			else if(option == 2)
				{
					System.out.println("You have chosen Mage.");
					System.out.println("                                                                                                                                                                                                       \r\n" + 
							"                                                                                                                                                                                                        \r\n" + 
							"                                                                                        ``                                                                                                              \r\n" + 
							"                                                                                    ``.....`````````                                                                                                    \r\n" + 
							"                                                                                  ``````..``........```````                                                                                             \r\n" + 
							"                                                                      `````````````````````````````..........```                                                                                        \r\n" + 
							"                                                      ```````````` ```..------------....`.```````````````.----..````````                                                                                \r\n" + 
							"                                                     ```::--.....````..-///::::::::-----::::--....`````````...------....```````                                                                         \r\n" + 
							"                                                     ``./-....-::--...-:::--........----::::::::::---...-..-----:::::::-----..````                                                                      \r\n" + 
							"                                                     ``--.`````.:::::::----......------........----::---::::---------::::://:---....````                                                                \r\n" + 
							"                                                     ``-.`` ````.-:::::-.------....```````````````........--::::-----------:::::--..---..`` `                                                           \r\n" + 
							"                                                      `-.`   ```..-::------..````````   ``   `````````````....---:::::------:::::::--....-..````                                                        \r\n" + 
							"                                                      ``.`    ``..-::-----.`````  ```       `       ` ````````.------:::::::::::::::---....--..```                                                      \r\n" + 
							"                                                      ```` `````-.-:::----.` ``````                          ``.---:::---::::------::---:--..---..```                                                   \r\n" + 
							"                          ```...`````                 ```  ```.--.-::-::-.``````                               ``.---:::::----------------::-...---.````                                                \r\n" + 
							"                         `.-:::-:--..``              ````````.--..-:----.``  `.-://::--.`...                     ``..-------....--------.--:::-------.`````                                             \r\n" + 
							"                        ``.-::::::::--.``            ````...--.`...---.``        ```.-:/ohddo-     ``....-/+/:-..`````...-----.....-------.--:----------`````                                           \r\n" + 
							"                         ``.-:----:::--.````   ````````...-:-.```..--.``                 `:ohdy:-oyyyhhyso+++/ooso+:-....`...-....---------------::::::-:-...`````                                      \r\n" + 
							"                         ```.--.....-----....``.`....---:::-..```.-..```             `       -omdddddhhyyysoo+ooo+s++///-....``````...------..---::::::-::--..````                                      \r\n" + 
							"                        ````.-:-..```...---------------:--.........````                       `..-:/++oyhhhyhhhh++sso++//:::--.````````````..`..---::-----::--..```                                     \r\n" + 
							"          `````````````````..-::.```````..-----------.......----..``                                     `.:+Nmdsoohsoo/+o+//:/:..``` ``````....-------..``...-:.```                                    \r\n" + 
							"       ``..-..--........-....----```  ````..----------...-----..```                                          -mmysyhhyyys++/++/+----.`   ````--....--:-.``````.-:.````                                  \r\n" + 
							"      `.-:::::::------------.....```      ``......---.........````                                            -Nyyyyhdysooo++++/+/-:-..`   ```.--....-:-.``  ```.-:-.``                                 \r\n" + 
							"     `.-:::--......`````..``..``.` `        ```````````````.``                                                 ohhdddyysooo+o+/+/+/----.`   ````..--.`...``   ``..-:-.```                               \r\n" + 
							"    ``.-/-.-s.` `````````````````  `  `  ``    `         `                                                 `  :Mddddhyhyooo+o+++o/+o/:--.    `````````` `````  ``.-----.```                             \r\n" + 
							"    ``.-:.`sh` `    ````````     ``    `..    `                              `            `.-+/+-.         ` `/mdhhhhhhhyooosoooooo+yo+//-`    `             `...--------.``                            \r\n" + 
							"     `.-:.:hy``    ``.-:-.`++//:::.  `   +s+`                                 `          /mdddddmmmhs/-`     -yddddddhhhdyysysssssso//:+++-                   ``--------:-.``                           \r\n" + 
							"     ``.:`ohy-    ```.---+sdhhyhsso:````` oh+                            `  /+oysssoo+++/::ohdmmdhyyyyhdyo/.`Nmdddmdddhhhhhyyyyso+///::/++/.                  ```.-----:----.``                         \r\n" + 
							"     ``.--:hhy-  `   `-/yyyyy+:-.```````` /sm.                            +sssysyyyyhdmmmNmmhhdhhhhyssssyhyhymmddddddmmdddhyshysoo+//////so:                  `````.------::-.``                        \r\n" + 
							"     ```.-`sydhyyysshhyhhyyo-:::-.`....../oshy`                         `/syyyyhyyyhhddmmmdhhhdhyhhysooosyhyhdmmdhdhddddysssoyyssoo/+/:/::ss                   `````..-----:-...``                      \r\n" + 
							"       ``..:ysoydmddhhhhdhhy//::-.`..--::oyyy+                          ` ```.:+yhdddmmmmmhhhmmmdhhyhsossssyhdmmmdddhyyyysoooohyso/:+ossso/o` `                 ``````.-----:-..```                     \r\n" + 
							"        ``.-.```..:shhyyddh+:+o+/:::/+ss+:/o+. `                   .`.-:++++osssyyddddmmddmdmddmmhyhhs+++ooyhhNmmdhdhyhyyyysoooooossyddho.``                    ``  ```..------..```                    \r\n" + 
							"         ```:-.`````syyyhhy:ooosysossyhyy:--.```                  -yssyhhhhyyyhyyhdddmmmdmdhssohddhdddyy+/+oyhNdhhhhhhsosso:....-/+sshyo:`   `                         `..--.---..``                    \r\n" + 
							"          ```..-..``yyyhsyy/syysossyyyyhs`.-.````                  .ysysyyyyyyhdhhhdmmNNNddddsymmmddmmhyo//+sdNdhddyyyss++//:---:://oy/::    `                         ```.------.``                    \r\n" + 
							"            ````...`-+yhyhy:syyyyyyyyhhhs``....``                    .:syysssyydmmmNmmmmNdddmdhhmmmdddd+////hNNhddddmyys+//:-:--:::sy+/:-..`                             `..-----.``                    \r\n" + 
							"                ``.-..-osyy+ohhhhhhyhdyy. ````..`                 `    `/yddmmmmmmmNmdddmmmNmmhsydmddhs:://yNmmmmmmdhyss+//:::--:oym////::-..``                  ``````  ``..----.``                    \r\n" + 
							"                  ``..----:::++shdmhddhhso:```-.`                  `.-+shdmdmmmmmmmmmmmmdhdmddddhdmdhhoosshNmmNmmmmhhyo+/:--.-:+ydmo:///:::::-.`                 ```.-.`````.----.``                    \r\n" + 
							"                   ```...-:/:-.`./dmdddddhh/.-.`````           `.-/shhdddddmmmmmddyddmmdhssdhhhddmmddyyyhdmmmmmmmNmdhyso/-::/oydmms:++/+///os+:                  ``.--:-.````..--.``                    \r\n" + 
							"                     `````....````+mmhhhdddho-`...-.``     `.:+syhhhhhdhddmmNmdhyysddddmdo+ydhdmmmddhyhhhdmmmmddmmmmhyhysssyhmdhhh++++++++syyo.                    `-:::..````..:-..`                   \r\n" + 
							"                          ```````.:shhhhdddysy/:::::-.`` `/yhhyhyhhhhdddmmmmdyyhhdmhshhdmsshmmmmmdhdyhhyhdmmmddmhmmmNhhhsydmmmmmhs+o+ooo+++os`                    ``.:---.``  `.-:--.```                \r\n" + 
							"                            ``.-...`-+yhddhy:/:os/..-.`   :yhhyyyhddddmdmddyssydmdhysydmdhhmmmmmmyhhhhyyhmmmmddddhdmNmdddmmddmNdyo+//+o++o+/`                    ```.:-.-.``  ``.--:-..``               \r\n" + 
							"                            `..-..````.+hhs//o-:ohs+. ` `  :sydhdddmmmdddssyydmdyssshdmmdmmmddmmmddhyyhhddmddddddddhNmddhhdddmdysso/+yhysso- `                    ``.-.``.`    ``------``               \r\n" + 
							"                             ```......`.-/+yyyyo//sdh/-``  ./ydmdmmmddhyyyhmmmdhsyhdmmmmmmdddhhhdmmddhsoydddhdmdhdddmddddmmmmdhyysssoyyyys+.                       ``-.````  ````.-----..`              \r\n" + 
							"                                ```   ````-sdhhdddhdmmhy++sydmmmmddhysssdmmddhyshmmmmmddmddhso+osyddh+//shddhyysyyhdddddmdmdhhhyyssyysshso/.                       ``.-```````.``.---:--..`             \r\n" + 
							"                                      ``  ``/dddddddmmdhhyosymdhdhyyyhdmmdyyyssdmNmmdddddhyys+/++oyyd+/:+hddyo+:--soddmddmdhhhyyyyyyyhhhso:.                      ````-``````.-...-----:-.``            \r\n" + 
							"                                             .smddddddddhhhydhyydyyhmmmhoyyhhmmNmmmmddddhhssyso++syyhs/+ohdyyo--.:ooddmmhdddhhyyyhmddddyy+++-.                     ` `- ````.------::----.``            \r\n" + 
							"                                            ```smmddhyhddddddhyhddmmmmhhyyhdmmmmNmmmddddhhsssysosyhhhyssohyys//.:ssydhhsoshdmdhhddmNmNh:+o//o/:.                      `  ```.-----::::::--``            \r\n" + 
							"                                           `symNNmdmmdhhdmmddmddmmmyydysydmmmmmmmmmmmdmmdhhhyyhhhyhhhhysohhy++//yyhdyo+o+ydmmmmmmmmmmm+  `+ssooo:.     `                  ``.----::--:::--.`            \r\n" + 
							"                                           `mmmNmmmmdddddmmdhmmmmmyhyshdmmmmdmmmmmmmmmmmmddddddhhyhdhyysyhhy+++hhdy++++oyhddmNmddmmmdm:  ` `ohyssy+.               `       ``.---:-..-::--.``           \r\n" + 
							"                                            -/dNNmmmmmmNmmddmmmmddyysdmmddmmmmmdddmmmmmmmmNmmmddddhhdyysdhmysydhyyyoosyssyhmmmhoshdddN-    ` `ohsoyh+.   `                 ``.----....-::.```           \r\n" + 
							"                                               /smNmmmNmNNNNmmmddmmdmmmmmmddmmddo`/NmmNmmNmmmmmddhhhsosydhyoyyyysyhyyy/+sdmmddyoohdddN-      ` .omyshh+.                   ``..-...``..::-.``           \r\n" + 
							"                                                 `sNmmNNmNdyddhdhhdmmNmdmmmd::// .ymNmmmmmmmmdhmhhdhhhddddddhooyhhyys:-/shddddhoyyh/:``          .shosyh+.                   ````````.-::-.`            \r\n" + 
							"                                               `:hNmmmmmNmhhhhhdddddhyhdddy:::::::+hhyymmmhddhhhhhhyhmmmmdddhysydhhhho-::/+hshhsy+                 .sdhyhhs/-.`                   ``..::/-.``           \r\n" + 
							"                                              .yNmmmNmNmmmmddmmmdhhyyyhhyhyyyyyyyyyyyhhddddddhhdhyhyssydhdhdhhds+hhdddo-+oo+:yyoss                  .dyssyhhyyhs+:` ``            `..-::/:.``           \r\n" + 
							"                                             `NNmmmmmNmmmdhyyhmmdhhhyhhdhhyhhhhdddddddmmmmmmddhhhhhyss+oyyysyds/yddhhy::/soso+hsoy`                 :hy.-/syso+/yh/`` `          ``.-:::/:.```          \r\n" + 
							"                                              /Nmmmmmmmmmmmdddmmmddddddhhddddddmmmdmmmmmmmmmddhhhhysyhhhyo/.```..:+///:++o+oo/yysyo/...`          ``.oo-yyhyhyo+/::-..````      ``..-:::/:.``           \r\n" + 
							"                                               +sdmmmdyddmNNmmmmmmmmmmmmNmmhyssmNmmmmmmmmmdddddddyyyhmddhy++/.  `//+++++++++o:ossysyyy+:         ``..---+ssyhhysys:----..````````.----:::-.`            \r\n" + 
							"                                                 `:/:`-dmNmmNmNmNs..+s/:-:/oysmmNmmmmmmmmmmdddddddhhhddd/+oyso+:-://::://+/+/.oo+sosshyo+      `  `.---..+hhhyyysy+-`------.....---..-:-..``            \r\n" + 
							"                                                 `   :mmmmmmmmmNo`    -+hdddddddddmmmmmmmmmmmmmmhhdhhddy:+:..:/+ooo+++/////:..o++o+ssyss+-``      ``.--.``/hhhsysso/-`..--:::::::-..--..````            \r\n" + 
							"                                                     ohdmmddmmm:     -yhdddddmhdddhhddmmmmmddmmmhdhhddhhoo+- `` `.::::----:.`//:/++osysoo+:--`      ``..-.`-hhhsysos+-.`..-:://::----.````              \r\n" + 
							"                                                `    ``.:sNmmy.   `    :NNmmmmdddhhhyyhhyhdddddddhhdhyssyyso/-..``.-:/::--.-oo++oooosysssyhho/`       ```--.-shysyssho/.`...--:::::-.`````              \r\n" + 
							"                                                         ./-.`      ` /mmmmNmNmmmdhhyhyyssosshhdhhso+ooyhhyo+oooo+/+/.``` .yo++osyyyyyhyhdmdds-`        ``....+hhhysdhyo/---.-.---..``                  \r\n" + 
							"                                                                     +mdmmmmmmmmmddddhhhyysoosssy+-/+ydddhhy/.`...``     `ssoooyhdhdhyyhddNdhds/.`      `````` :dhyohdhhho--:---..```                   \r\n" + 
							"                                                                    :mmNmmmmmmmmdhddhyhhddhhhyysyo+syoshhhhhhs:``         osssyyhdhyyydmmms.`/dy+o`           ``shhdddhhdo+:-:::---.``                  \r\n" + 
							"                                                                    .+NNNNNNmmmmdhddyyhddddhddddhddyyssosyhhhhy-          `oyyydhhdy:.oNm+`   -mho.       ./s/osyhyshhmmdohs/:-::--.``                  \r\n" + 
							"                                                         `         `+mmmNNNNmmmNNmmdhhhdddhhdddhhhhhyysosyddhyys/-`        `:shyyo/.   Ndo` `./hyo+      -yyyyhyyyydmddmdyhhy+:::-.``                   \r\n" + 
							"                                                                  -ymmmNNNNmmmmmNmmmmmmmdddhddddddhhdhddddddhhhhyyso/.`       `` `  `` dmh//yyyo-``      +hd/.``  `Ndmddhyyyoo//+-``                    \r\n" + 
							"                                                                `+dmmmmNmNmmmmmmNmmmmdmmmmmdmddddmdmNmdddddddhhhyyssyyso/:.`  `+:`` :oohhso+s/-          :dd`      odddhhys/++osyo:``                   \r\n" + 
							"                                                               :hmmmmmmmmmmmmmmNmmddddddddmmmmdmmmddmmmdddddhhhhhdhyyyyyhhys+-.`sys+/:/hdhho.  `          od       `-+yhy+//oyyhhyhso. `````````        \r\n" + 
							"                                                             `smmmdmNNmmmdddmmNNddmmdddmhdNmddhddhddmmmmddddhhhyyhhddddhhhyyhy.  -/+oyhhyd- `              :    ` ``-.-+:+yhyhhhhyhhmo:```..-..``       \r\n" + 
							"                                                            -dmdmmmmNmmmmdddmmmmmmmmddddddmdhhdddhhhdddmmddhhhhyyyhhyhddddhhy-.````  `.-```                       `.:--../yhhydm`  `/hys//-::/:-``      \r\n" + 
							"                                                           +NmddmmNNmmmmddmmmmmmmmmmddddmmmdhhhhyyyyhddmmdhhddhyhhhhysyyhhhhyy++//::-..` `                         ```````./sddN``   `odds`.-:/:.`      \r\n" + 
							"                                                        ``sNmdmmNNmmmmmmdmNNmmmmmmddddddmmmdhhddhhhyyhhdddddddhhhhhyyyyyhhyyso++++++++/::-..``                     ` ..```````sdy`     +dh/..:/-.`      \r\n" + 
							"                                                        -dmmmdmNmNmmddmddmmmmdddddhddddhmmmddhhhhyhyhhhhdddmdhhdhhhdddmmdyyso+++ooo+//:::/:::-..`                    ```...`  `hmd/     +hh+.:/-.`      \r\n" + 
							"                                                       /NmddmmNNmmmdddddmNNmdddhhhhdmdhdmmddddddddddhyyyhhddmdhdmmmmmmmddddhysooooo+++//////////:.` `                   `  `   -mdm- `  `oh/.::-.`      \r\n" + 
							"                                                     .yNmdmmNNNmmdmmdhdmmmmdddddddddmdydmmddddhddddddsyysyhddmmNmmmmmmmmmmddddhhsssoo+++++++////++:`` `                       `smd-  ``` +h---:-``      \r\n" + 
							"                                                  ` :mmmdNmmNNmddmdmddmmmmmddddhddddddhddmdddddmdhhhdsssssyyyhdmNNmmmmmmmmmmddhhdhhyssoo++++++++ossso:                      `-ymd: `..```y:`--:.``      \r\n" + 
							"                                                  `oNNmmNmmNmmddddddmNmmmmmmmmmmddmdmymmmmmddddddddmddsosssssooymmNNNmmmNNNNNNmmddddhhhyyyysyyyyyhhhhy/                  `-odmdo-` `-...-.`.---```      \r\n" + 
							"                                                 -dNNmNmNmmmmmddmddmmmmmmmmmmmmmmmddmhmdmmmdmmmmmmdmdsoooooooooo+dmmNNmmNdmmdmmmNmmmmdddddddddddddhhhdd+:               :o+/:` `   ```.:.--::-.`        \r\n" + 
							"                                                 .-oNmmNNmmmmmmmmmmmmmmmmmmmmmmmmmmdmdmddmmddddhyssymhysossosssoo+ymmNmNmmmNNhddmmmmmmmmmmdddddhdhhhyyddm/`                          `.:::-..```        \r\n" + 
							"                                                 :hNmmmmmmmmmmmmmmNmmmmmmmmmmmmmmmmmdddhyddhhhyso+++omdyooooosoosssoymmmmNNy-```..-/+osyyhNNNmmmmmmmmmddmmy:`                        `...````           \r\n" + 
							"                                   `-+o+++++++++dNmmmmmmmmmNNNmmmmmmmmmmmmmmmmmmmmddhhysshmhyssso++/+oddyo+oososoooo+ohmms.             -sNdmmNNmmmmmmmmmmd+/                          `                \r\n" + 
							"                               `-/sdmNddhhyshmNmmmmmmmmmmmmmmmmmmmmmmmmNmmmmmddmmhdhyyysssmhyssyosoo++oddhsosoosoooooo+s-`            .smmddmdmmmdhdmdshhddy.                                           \r\n" + 
							"                            `./osyyy+-.`./oydmmdmmmmmmmmmmNmmmmmmmmmmmmNmddddddmdhhhyhyysodmysssysso+o++ymdho+ooo+oossooo:       ` `  .mdmddmmdhddddmhhhdd+`                                            \r\n" + 
							"                               ````.-/shdmddddmmmmmmmmmmmmmmdmmmmmmmmmmmdddddhhddhhyyyyyyoymdssssyooo+/+/ommdhsooooosysos-           +dmmmmddmddhmmmmdhho.   `                                          \r\n" + 
							"                              `:+shddmmdddmmmmmdmmmmmmmmmmdddmmmmddmdmmddddddhhddhyyyyyyysommhsssss++//:++yhdddhsoooysys-          -ymmNmmNddddddhmmmNo`                                                \r\n" + 
							"                         `./oyhdmddddddddmmmdddmmmmmmNmmdddmmmmmmddddmdhdddhhhhdhhhyhyysss+dmmysssso+oosyysoodmmhyysho:` `       -smNhdNmmmmdddddsmNNNs                                                 \r\n" + 
							"                      `-+yhhdddddddhhdmddddmmdddmmmNNmmdddmmmmmddddddNhddddhhhydhhhyyhhyysoymmdssooysyhyyyyysoys-:/+-`         .sdmh/`smdmmmddhhdhsNNNy`                                                \r\n" + 
							"                   `.+shhdhhyyso//+oydmdddddddmmNmmmmdddddmmmmddddddmmhhdhhhhhyhhyhhyhyyysssdmmdsoossoysyssoo+++.` `         .smmh/``odmddmmdhyhhhyhdmm+.                                               \r\n" + 
							"                    ` ```...``-/syddddddddddmNmmNNmdddddmmmmmdddddhdmdhhhhhhhhhhdyhhyyyyyssoydmmyoooos+++++++++++/`        .odmd+` :dmddddmmdhhdhdyyhhhy:                                               \r\n" + 
							"                `         .:oyddddddddddmmmdmmNNmmdhddddmmmmddddmhhmmdhhhhhhyhhydyhhyhyyysssshdmdsoooo+/++/+/++++++-`    .+dNdo.`-sdddddmmmhy++/-......```                                              \r\n" + 
							"                      `-+sddddddddhdddmhosdmmmmmddhhddmmNNmdddddhhmNmhdhhhyyyyhymyhyshyyyyyyysdmmdso+++++++++++++++s/ `.odmms.`-sdddddmdho:``                                                           \r\n" + 
							"                 ` .-ohddhhhhhhyhdmmmy//hNNmNmmmhhhddmmmNmdddmdhhdmNdhhyyyyyyhhymyhhyyyyyyyyyshdmddso+++oyy//++ooss/-ohdNmy-`:ymdddhhdo:`                                                               \r\n" + 
							"               `./shddhyyyyyyhddmmd+/sdMmmmmmmddhhddmNNNmddddmdhdNmNhdhyyyyyyyhymhyhyyyyhyssyosdmmddo+ooysys/osy/:/ymNdmmd/yhmdddddh+.                                                                  \r\n" + 
							"            `:ohddhhyyyyhhhdmmmdy::yNNmNNmmdhdhhhdmmmNmmdddddmhdmNNmhhyhyhyyyyhymdyhhyyysysso+oymmdmdoossyhyho/-+ddmdmmmmdmmddmdhy:`                                                                    \r\n" + 
							"         ./sdmmddmmdhhhds+:-::-.  oNNNmNmdhhhhhhdmmNNmmddhdddhhmmNmdhhhyyyyysyhymdhhhyyyysssssoodmmdmhyhhm+..odmdhyhhddmmdmdmmhd/   `                                                                   \r\n" + 
							"        +mmmmmmmmmmdds:`           /mmmdhhhhhhdmmmNNmdhhhhddhhdmmNNhhhhyyyyssyhymmhhhyssyyyysooohddmdmmmdm:+dmmmhhhddmhmddmmNdd.                                                                        \r\n" + 
							"        -::--..```..               `ydhhhhyyyddmmmNmdhhdhhhdhdmmmmmhhhhysysssyhydmdyyysssyysyysysdhmmmdhhmddmddmmdmmmmdmmmmmy+-                                                                         \r\n" + 
							"                            `    `:shhhyyyyhdmmmmNmhhhdhhhhhhmmmmmdhyhyysssssyhymNdysysssysyyysooyddmmmmmdyhmmdyymmmmmmmmmNs                                                                            \r\n" + 
							"                         `    ` :yhhhhyyyhdmmmmmmdhhhdddhhyddmmNmNhhyyyssssssyhymNdhsysssysyyysososhmmmmyhh.:-`  sNmmmmmmmN+`                                                                           \r\n" + 
							"                             `:ydhyyyyyyhdmmmmmmdhhhdhhdhyhdmmNNmNyhysysssossyhydNdhsyssssyyyhyssoohhmmmhhm       NmNmmdhhd.                                                                            \r\n" + 
							"                           `/hdhyyyyssyhdmmmmmmdhhhhhhhhyhdmmNNmNmyyyyysssoosyhydNmhyyssssysyyyyoooohmmmddN.      Nmmmhdhhh                                                                             \r\n" + 
							"                         `ohhhhyyssyyhhmdmmmmdhhhhhhhdyyhdmNNNmNNdyhyyyssssoosyhdNmddysoossyyysoso++oddmmdd+    `sNmmmhhddd`  `                                                                         \r\n" + 
							"                      `.oddhhyyysysyddmmNmmmdhhhyddhhyshhoNNmNmmNhyhysssosooosyydmmmhhsssssosssssso++hdddddN`   +NmmmNmmmhdd/                                                                           \r\n" + 
							"                     -sddhdhhyyyyyhhm+.sNmmdhhhhhhhyysyd-sNmmmmNNhyhysosssooosssdmNmhhsyssssysyssssyydmdhhdds    /mmmmmmdyyhs `                                                                         \r\n" + 
							"                 ``:ydddhhyhyyyyyddy.   .sdhhhhhhhhysyN/.MmmNNNmNhyyssossssossssdmNNhhhyhysssssysyshdmmmdhhdm-    /Nmmmddmhys.                                                                          \r\n" + 
							"                .+hddddhddhhhyyhdm:    `.yhhhhhhhyysymo sNNmmmNmdhyysssssssooss+dhs/yhhhhmysyyyyyyhNmmmmmhhydh     :mmmmmNmhyo.                                                                         \r\n" + 
							"             `:smmmmmhdddddddddms. `   :hdhhdhhhysosdy .NNmmNmmmhyyssssssssooso+h-  .dyhdhhsoyhyhdmNNmddmmhhdms     .ymmmddmhys-``                                                                      \r\n" + 
							"           .+hmmmmmNmNNNddhyyyo:`    .ohyyhddhhysosdd` oNmNNmmmmyyyysssyysssooo+h``  ohhdhhhsoyhmNmyyNmmmmmdddmo `   `/dmmmmmdhs+/`                                                                     \r\n" + 
							"         -shhhyyyyo//--..````       :hhhhhdhdhysssmd: `NNNmNNNNmyyyysssyysssoo++h`   .myhhhhdymd/-dNs/mmmmdddddd+      `+hhyyss+++:`                                                                    \r\n" + 
							"         `.```                    .ohhhyhhhhhhsoohmo  `+/+++ooodsyyyssssyssoooooy`    ohydhhmd+`  `hNh-yNdmmdmddd+`      `:shssso++:.`                                                                  \r\n" + 
							"                                 :hyhhhhhddhhhysdms`          `hsyyysssssssooooos-    .hyhmd+.  `  `oNm/+Nmdmmmdddo`  `    `.+ssss+/o:`                                                                 \r\n" + 
							"                               .ohyhhhhhhysoooosms`            yssysssssyssosoooy-    `oyy/`        `/mNs+mdmddmmddy.         `-osyos+:.                                                                \r\n" + 
							"                              :ydhhdhyyyyyysssymy`            `ysyyyyyyyssoossooy-     ``         `   .yNddmddhmmmmdh:    `      .:oss+/-  `                                                            \r\n" + 
							"                            .oddhhddysyyyhdddho:`             :ssyyyyhhhhysoooooy-                     `+mmmmdmNmmmddhs:            .:/oo:`                                                             \r\n" + 
							"                          `/hddddddhhdddho/-.                 osyyyhhyydhdhysso+s:                       :dmmdmmmmmmddmm`    `         `.-:.`                                                           \r\n" + 
							"                         .ohdddmmddhs+:.`                    `ysyhhhhyyhhhhhdhs+s:                        .Nddmmmdmmmmmho     `             ``                                                          \r\n" + 
							"                        :hmmddhs+:.`                         .yyhhhhhyyhyhhhhhdhh-    `                   `Nmmmmdmmdmhhyy/                                                                              \r\n" + 
							"                       :so/:.``                              :hhhhhyhhhhhhhhyo/:.                         :mmmdmmddmddhhss:                                                                             \r\n" + 
							"                                                             /dhhhhhys+/:-.`                              ommmdmmdmdhhhhyos+`                                                                           \r\n" + 
							"                                                             -//--.`                                      -mdmddmmmhhhhyyyhys:.`                                                                        \r\n" + 
							"                                                                                                           smmmmmmmhhhhdyydddys+-`                                                                      \r\n" + 
							"                                                                                                          `:Nmmmo-smmddhdddmdyyhs+.`                                                                    \r\n" + 
							"                                                                                                           `:+-`   `ommmmmdmmdhhyys+-` `                                                                \r\n" + 
							"                                                                                                                     .ymmmmmdmmmdhhmh+:`                                                                \r\n" + 
							"                                                                                                                       /NNmNmmmmdmdms+oo///:---:-..`                                                    \r\n" + 
							"                                                                                                                        `.:oymNNmddhsoooooossyss+/-`                                                    \r\n" + 
							"                                                                                                                        `     ./ssssyyyyyso+-`  `                                                       \r\n" + 
							"");
					System.out.println(" ");
				}
			else if(option == 3)
				{
					System.out.println("You have chosen Tank.");
					System.out.println("`oo.                                                                                                                                                                                                   \r\n" + 
							" .s+/.                                                                                                                                                                                                  \r\n" + 
							" :sy//.                                                                                                                                                                                                 \r\n" + 
							" /syo//.                                                                                                                                                                                                \r\n" + 
							" +sss-+:                                                                                                                                                                                                \r\n" + 
							"`+ssh:-+.                                                                                                                                                                                               \r\n" + 
							" +yoho-/:`                                                                                                                                                                                              \r\n" + 
							" /sssh:-+.                                                                                                                                                                                              \r\n" + 
							" :sysh+./:     `                                                                                                                                                                                        \r\n" + 
							" `oysyy-:/`                                                                                                                                                                                             \r\n" + 
							"  /yysh/-/-                                                                                                                                                                                             \r\n" + 
							"  -sysho-/:                                                                                                                                                                                             \r\n" + 
							"  `oysyy::/.                                                                                                                                                                                            \r\n" + 
							"   /yssy+-+-                                                                                                                                                                                            \r\n" + 
							"   .sysys-//`                                                                                                                                                                                           \r\n" + 
							"    +ysyh/:+-`                                                                                                                                                                                          \r\n" + 
							"    :yysho-/:`                                                                                                                                                                                          \r\n" + 
							"    .sysyy::+.                                                                                                                                                                                          \r\n" + 
							"    `+hssh+-+:`                                                                                                                                                                                         \r\n" + 
							"     :yyshs-//`                                                                                                                                                                                         \r\n" + 
							"     .ohsyh::+-                                                                              `                                                                                                          \r\n" + 
							"     `+yssh+:+:`                                                                 `    `-:/++:/-.                      ``--::-.``                                                                        \r\n" + 
							"      :syohy-//.                                                                 `.:+sddmdhys+:-.`.                `-+syhyso++/-`                                                                       \r\n" + 
							"      `oysyh::+-                                                                /yhddhhhhyssso++:::-:            `:shhhdhhyys+++/.                                                                      \r\n" + 
							"       /ysoyo-+/`                                                              `yhmdssyhso++oosoohy+/`         `:shdhhhmhhyssso/+:.``                                                                   \r\n" + 
							"       :syoyy:++-                                                             .ohmdo+syhhhmdssyyo+yy--       `:shyyyhhdhhhddhyoo/:::::-.`                                                               \r\n" + 
							"       .ohosh//+/`                                                           :yyhddosyhhysyssssshy/o/-:--`  .ohyyyhhhyddddhdddhhssso+++oo-                                                              \r\n" + 
							"        /yyoyo/++.                                                          :hyhhyhyshhssssodhsyssoo+:/:`  :yhssyhyyyhyyyhhhdddhyyysoso+o:`                                                             \r\n" + 
							"        :syoys//+:`                                                         -shhhhddoshhhyyohhyosys++//` `/yyosshsyyssossyhhhhyhyhhdhhys+++o+::/-                                                       \r\n" + 
							"        .oyosy+/++.                                                      `-/ossyyyhmy+syyhsoysyhyyyd/:hy/+yso+sysys+++ooyyydyshyhhhdhyssssyhhdho.                                                       \r\n" + 
							"         +ysoyo:++:                                                       `.-:ohyshhhossyyyssyysyhyd--hdyyoo+syoys+++/oysyyoysossyyyyyhddmmmds:`                                                        \r\n" + 
							"         -sy+ss//++`                                                        `+hhssyyhyosyyysodmhhdmm:o+dso+/ossys+ooossyyssy+ssoshddmmmdddhs/.                                                          \r\n" + 
							"         `+sooso:++-                                                       /hhyo/ysyymhysyyssddshhyhy/oyso++hoy++s+osyy+oos/syyhysoo+/+yysos+``                                                         \r\n" + 
							"         `/os+ss/++/                                             `   .o..+ss+soo/+ssyhmmmysyyhy+sosyho/ys+oysy:/+oysyyo++ssshysyyssyyyhdyyhddy`                                                         \r\n" + 
							"          -osoos+/++.                                             ``.-+y/-.+yys:/-sosymhdddhssyyshmdy/o+yssss:./oysysooy-:ossooosoyhddhys:--:oo.`                                                       \r\n" + 
							"          `+so+so/++/                                           .ooss/.` `shhyso/+hssyhhhyhddyyyhddh+oo+ssyss++ysys+/+ohyso+:/+oyhdhhhhhyso+/:-:::-`                                                    \r\n" + 
							"           :os/os//o+.                                          /+```   `ohhhhyoyNdsossoyhsyhydddhs/+/y+syysossyyo--/oyhss///o+///oyhdhhhyssso+::::::.        `.---                                     \r\n" + 
							"           -+s++s+/o+-                                          `.`     :dhhshsymssysososdoooyyhdyyhyhhh+yhsoysoo+oosssysssmmo++yyo+/:/+osyyyys+/:::::-....-:::///-.                                    \r\n" + 
							"           `+oo/ss/++/`                                  `.//+o++//:.` `oyysssydsyyyss+osdhsyyyyyyyhhyyhhhddyo+ossyyyysd+hohNy+ys+oosso+/::/://:::::///+/+++++ooo//-`                                   \r\n" + 
							"            :+s+os+/o+-                                 .ohhyyhys+////-:yyssooyhsssysss+sdhsyoyysydyyyhhdhhhddhdhyooooyh+hsohddddy+s///+osooosooosoossooooso+oo+/o//-                                   \r\n" + 
							"            -/oooyo/o+/`                                :yhhyyhyso+/-:++yyss++yhyyyyhooo+syyyyyyyyhyydhssosssyyhdhhysydssyoyoyhhddhoo+---:/oyyyyyssssoooooo++o+:/oo/:.                                  \r\n" + 
							"            ./+o+ss/+o+.                                .yyhhhhhhyss/osyhyso+/odyyyyyo+++osysyyhhyhydhssyyssoosooshmdhmoys+os+oooddyos/:.-..:+oshysossoooooo+++++/s+/- `                                \r\n" + 
							"            `/:o/+yo/o+:                                `yhhyyhhdmmooshhysysoo++hysyysoooyyyyssshdyhdssyyssssssssssdshh+do+//oso+oss+so/::--.-:/+oyysssoos+oooo++/oo+:.`                                \r\n" + 
							"             -:++/sy/+o/`                               `sddhyysyhhyhdhsoydmdhys+osyyyssysssossddyhmysshysssssssosydydsoyoo//++oossooss+//::--::::/ohyssosoo+o+++++syo/-``                              \r\n" + 
							"             `//o/oh+/o+-                               `/shdhysoosssyhyyhhhhhhhhysoooo+osossyhyshdhyssyyyyssssysshdhyyoyoo+///++++ooosoo+//::::::::/oyysoosss+/+osssys+:.`                             \r\n" + 
							"              :/o/+yo/++/                              .:/+ydhysooo+o+oosssyssyyyyyysyssysyyhyysyhdhyysssyyyyyssshddssy+syo+///+/+++++ssoooo+/+:/:::--/oyysso:-::-:osssyo/-.                            \r\n" + 
							"              ./+o/sy/++/.                          ` -//oshhhhyysso+++sssohssyyyyhyysyyyohhsyoshdhhdyyssssossyhhdhoyyoy+ys+/++//+/+++so+ooys+++////::::+yyo/:/:://::ososs+:.                           \r\n" + 
							"              `:/o/+y+/o+:                           .//syhyyyyosooosysossyhysssooyhossyhohys+odhyhhhdhhssyyyyhhhssyysooooho+////////+oosyoosssoos/://:::/o+//:/:::///+ssys+:-                          \r\n" + 
							"               ::o+/ss/o+/`                         `/+oyhyhyssso+/+++o+/ohhyyos+sodyysssysysohhhhhhhhhhyyyyyyyyssysssoss+syo/////+////+/+ysssoysso+so+:/://////:::////ossss+:-                         \r\n" + 
							"            `  .:/s:oy/+o+-                          `-ooyhhysss/-:+++oo+yhyyoo++soyyyys+ooyhyhhhyddhyoooyssssyssssoooosooosyo+/////+++/ossso+sys+++sso++//:////::://///oososo:`                        \r\n" + 
							"               `/:s:/yo/o+/`                          :/oyhhhyhysssoosoosydysoooossohsos+ohhdhyyhdhyoosssoossss+oooososssososyo////+/+osssy+ososo+o+os+s++o+/o///:://////oos+ss:`                       \r\n" + 
							"                :-+//sy++++.                         .:/syyyyyso//+++oossdhssoossooyysssydddhhhdds+o/++oosoooos+oooosssossosssyo++//++/+ysss/+ssso+syssysooosdy+////////:+o+++ss:.                      \r\n" + 
							"                .-/o:hsyso/:                         /osyhhyysys++ososoo+ydoosssshysoyyhohdyhdhy+++o++oosssssossosososoooososssyo+////+/s++oo+oysooysoo+so+oshhy/::///+/:/oo+++yo:`                     \r\n" + 
							"                `-.s-sosys/+`                         `.:+oyhhhhysso+oo+oyddhhdhoo+osyhsy+mdddh+//++ooo+ooosssoossoooso+syyssyyyhs+///++o+ooosssos+syoo++sso++sds///////////oso+yo:`                    \r\n" + 
							"                `-.+ysoysyo/-                         `-/+shhyyssso//+ooosydyhdyo+shhyssyshhdys//++/o+oo+ooo+/+ssoossssssyshyyyssys+//+/+++yssoo/oy/+ssosoo/+osshs///+////////osoyo-`                   \r\n" + 
							"                 ..:soysoyyo/`                       `/ooosyyyssooosssssoosdhdy+yhhhhyhhyhoydyo:/+++++so+oos++/sosoossssyyyo+:://://///+//+soo//oo+s+/yyoo+///ssshs+/++////:///+ssh+-                   \r\n" + 
							"                 `+-sssyhyyso-                        ```````..-++oo+o+:/sshdhhddddhhdhysosdys+:/++o+oo/+oo+osy+sssoossy+so+-.-:://////////+ooo::+o:++yyysoo//+yoyyss++/////++//+syh/.                  \r\n" + 
							"             ``   osssyhysyyyo`      `                      ` `+o+///:./+oyymddddyhhhhssooyhy+:://++++/+o++oyyhh+ssososy/yo+/-.:/:://////++++++o+o/::+syyysoossysososyyo+/+++////+yhy/`                 \r\n" + 
							"   ``.--````-s:  `oossyydddyhy/` `:.``` ```             `   `.syysyo+--+osyyhddhdhyysooo+odho//://////++//oyydhssoossssss+yo+/:--:////+o//ooooooo/-:::ooyyyyyyso++oosysyo//+//++/+ohhs:`                \r\n" + 
							"  `-/++os+oooy+.`.oossys+ddhhyyo  -ys:/o+oo`            `:::shhyyysssssosyyyshddhhso+/++oyhyo/://///:+++/+yydho++os+osssssoso+//::////+oyo::+oso+/:-.osysyyyso+++/+++syyy+++++++//+shhs:`               \r\n" + 
							"    `-/++//+o+ossoossooyyyysyyho++oyyyssys.         .:/:-syddhdhysosysyyhyhhhyyoo/:/y++oshhs/:-///:://+/+yhdyo+osyhdyssssssosoo/////////:os+::+oo+/::syo//ossso+/+o//+ss+oo++o++++//yyds-`              \r\n" + 
							"      `.:-//+/oossoooooss+oosdhsosyyyhs+/`        `+ydddsyhyyhhhhdhyyyyyyyhhdhyyo/+hmy:+hhy+--:::://///+yyshyshyhhhdhhsossososoo++//////./sysoooys+/+yy+-/+ssshyy+y+++:/oosooo+o++++ohhho-              \r\n" + 
							"            `.:/+syyhyyyyoyhhyyso++oo+`           /hdyossmsyhoyhhhhhdhyhhyyyhdyo/+dddyoosyso++//::/+/oo++ssoohmddmdmdhdhssyossssso++////++-///so/syo/+/o+o///+shyss///+os+sssoo+oo+++shhy+.             \r\n" + 
							"               `syysoosyhsshhoyys/dyoo-         ./o/++/ohddyydhsyhhyhdhhyhhyyyo/oddddhyhhhhhhhyyoosyyyys/oohhshdddsdmdhNdyosssysosso++///+/:::+s//oho//+///osssyyyso+ss+++ooossosso+o+yhds:             \r\n" + 
							"               ./shhyhhdddhyhhd/+hddhy+://++o+:/osso/osoydyyysdhyssydddhdyyhy++ohdhhdhsooosyhhyyyhyhdyshhysyddhyhdddmmddhddsssssysssso+++///++/s/-:+yo//:///osoyyhyyyy+o//o+++ssysooo+ohhh+-            \r\n" + 
							"                /++soyys++dhdyohmddhyyyssososyo:+syyyyyssdhyhyyhyhhysyhhddyysso+yhdhhdyso+oyhyyhyddmhysosydhyyhhdyhddNhmhyyhhssssoyyssosso+/+++o+-//syo++:/o+:::+ssydyo+/o++oo++ossooooohdho`           \r\n" + 
							"                ::ossyhhhsdhhhhhmdhdhhhhhyyyshhsyyhhhhhhhhhdddyyhsooyyysyhhhhoohhhdhdddhhhhdddmdhhhdyyssssyssdyyhdhyhddmssyhdddsssssssysoyso//++o+o/+ossss+/+ss+syyyyssss++oo+oo++ossssoyhdy/           \r\n" + 
							"                :soosyyso/ydhhyhmmmdddddhhhhhhdhhhddhhddhhyhhhhsyysoosyyshhss+ohhdddhdddhdhyhhhddhdyhyyyossyysddyyhhosdmysshdhhhysssssoyssys+//++/++++/++ossoo+++osyssosssooooo++o++syssshhdo-          \r\n" + 
							"                `+:+ssshhsyhhdhymmdddddmddhhdhddhhhhhhhdhhhyyyyyyysoshysshssoshhhhhdhhhdhddmdhhhhhhhdyysssssshdhhdsosoddy+ohdhsyyNhssyssyssyo++++++++++/++ooo++oo:+ssssoossosyooso+ooosysyydho`         \r\n" + 
							"                `/+ooyyyoodyydyydmdhddhmhhhhhyddhyyyhhyhyyysyysyyysssyyoyyo+ohhdhhhhhhhhhhdddmmddddhhdhhhhsshdhhhyosssdms+shhdhydmdhysyssssyys+++++++++++++oso//o+:+ssooososssysoss+ososyshydy/  `      \r\n" + 
							"                 `-ooooyhshhhdhyddhdhhdmyyhyhyhddsysyhyhsosooo+yyysoosyshs+/yhhhhhhhhhhhhhhyyyyhddddddhdhsssssyddosysohNhyhdhhhdddmsyyyysyyysyyo+o+++++oooo++so/+o+:+yso+oososssyysyoyssssyhhdo.        \r\n" + 
							"                ` `:ossyydhhhdhyhdmhdmmmhyhyyyydmso+shhyo+o+++ohyssssyyyho/ohhhhhhhhhhyyo+syyhdyhhdddddmosys+s+hdhdddhymhdddddhhhddhyyyyysyyyyysso+++ooooooo++oo/+o+:/ssooossssyshysysyyoyyhhmh/`       \r\n" + 
							"                   -ohshdmyshddyhddmhhyydyhyhhsmmy++yyhyosssyyhyysooososo++yhhhhhhyso++++++ooossyhddhhhyyhysssymhhhdhdhdhdddddddhhho+ooyssshyyyyyyso++ososooo+os+/+++:/sy+oosssyhshysyshyyyhhdds.       \r\n" + 
							"                    .--:--:ssddhhysyyyssdhhysssyy+/shyhsyhddmdyyysssyyyyyyyhhhhyoo+++++o+++++ooyhdhh+hdhyhhdhhdhdydddhhdddhdddhddhds//+shossyyyhhyyyso++ooossooss+/+o+//ssooosysyhsdhhhyyyyyhhmh+`      \r\n" + 
							"                           /yhddhs.``.--:/++++++/+shhyhhssyhhysyyyyyyyyyhhhhhyo/+++++/++++o++oydhhyd:yhhoooyyysys/ymhdhhhdhyhhdddhddy+++oyossoshhyyyyyso+oossssssoo++oo/+so+ssssyyyydhhhyyyyhhddy:      \r\n" + 
							"                           .sydmhy- ` `-///++++++ohhhsyyhsssssssyyyyyyyyhhhho/::::///+++++++oshdhhdd/odho++++/+++/sdhyshhddhyyhhddhdms+++sysysoosyhyyyyyysoossssssssoooo+++ooosssyyyhdyhyyyyydhmho`     \r\n" + 
							"                            /yhhyys.`.:+/+++++++ohhdssyhysoossssssyyyyyhyhhyo+///+++++++//+oyhdhhdyd++hhsso////+//+hdyydhyhhyyyyyhdddmhyyydhyhhshhdhsshyyhhyssosssyyysssssoyysyssyyyyhhhyhyhyhddmy:     \r\n" + 
							"                            -syyhsh+:///++++ooo+hhdyossyooosssssosyyyyyyyyyhhhyso+++////++oyhdhhhhym++yhysso//:++:+hdyhdhsyhhyhhhddhdddhyyhdyydddys/`./syyhhhhyssssyyyyyyyyysyyhhyyyhydddhhhhyddmho`    \r\n" + 
							"                            :oohdyyy/+++ooo+oooyhdyssssooossssssssyyyyyyyyyyyhhhhhsoooo+ossydhyhyhhdo/sdhssso/:/o++sdhyddyhhhyhyyhhddhddhyhhdyhdhdhs.  `:+syhhhhhyysssssyyyyyyyhsyhhhyyddhhhhhhdddy:    \r\n" + 
							"                        `  `-oyhmmdh++o+o++oooyhhyosssooossssosssyyyyyyyyyyysssyhhdhhhhhyssddyhhyhhds/odhyooso/:oo+ohhyhhhhhhhysyhyhhhhhdyhyysodmdddy/`   ./syyyhhhhhysssyyyyyyyyyyyydhdddhhhhhddmh+`   \r\n" + 
							"                            `+hymmdyooo+o+oooshhhosssoooosssoosssyyyyyyyyyyoo+osyyhhhhhdhdddydhhhhhdy/ohdyossso/+ooshdyhhhhdddhhhhsydhdhhyo+oyoodmmdddy:`   `:oyhhhhhddhyyssyyyyyyyhyhddddhdddhddddy-   \r\n" + 
							"                          `.:+yhmmdhoo++o+ooshhhssssoososssssssssyyyyyyyyo++oshhhyyyhhhhdddyhmmdmdddy/+ydyoyosso++ooydyyyyddddmdhhhhhyhdhhooooyoshddmddho-    `./oyhhhddddhhyysssyyhyhhhddddhhhddhmh+   \r\n" + 
							"                      ` `-/+++osdmmyo+oo+oosyhhssssooooossssssssyyyhyys+:/oyhhhhyhyyssyhddmddmmmmmmmh/+sdhooyosso+osydhyoshdhddddhhddddhhhs+ooossdhyssyhdh+`     `.-+shhhddhhdhhyssyyhhhdddddhhhdhmdy.  \r\n" + 
							"                     `./+o++++oooyyooooo+oohhdssssooooosssssossyyyysso:/+ydhhhhyssssoosyyhdddmmmmmmmh++odds+ysoso+osyddysoshdNhyhhhddddddhhysysyhhysso+/---.    `    `-/syhhhhhhhhhhyyyyhhhddhhhddddh+  \r\n" + 
							"                   `-/ooo++++ssooooooo++oshhhssysooooossssssssssyhyyo+soyhhyyyysoooooossyyhhhhhdddhhh++shmy+syossoosyhdysosyddyhysyhhhhdhyddhhhhdhysoso+o-              `.:+yhhhdddhhhhhhyyyhhhhddddhy. \r\n" + 
							"                 `-+oo++//+oooooo+ooo+ooohhdyssyoooooossssossyso+syhmdhsyssooo++ooosssyyyhhhddhdhyooyo+symyoosysssooyhdyyooohyyhyoyysshhyshdhhhhdhyo+o++o:`                 `.:+syhddddhhdddhhhhdddddy. \r\n" + 
							"              ``:+oo++//++oosoo+oooooooohhdssyssoossoossssssyoooyssshdmdyyy+/++osssyyyyyhhhhhhyso++oyo+osddsosyssssoshmhyoosssyhssysyhhhssyddhhhddsoooo+oy:.                     .-/oshhhhddhhhddhhddho \r\n" + 
							"             `:ooo++///+oossoooooooooooydhysyss+oosssssssssso+ooyhddhyyhhysssossyyyyyhhhssyhyssooyddhoooshmyosossosssymhyoooss/ohyyyhdhyosyhddhddhoosoo/+ys+`                         ./+oyhddddddddmdy.\r\n" + 
							"           .:os+++::/++osoooooosooooosydhhsysoo+osssssssssso/+osyhddddhyyhyyyyyyhhhhhhhhhysoosyhhddhho+ssyddyoossssssymdyoossys-+yyyyysoossyhhdddyooooo+:/o+`                             `-/+syhdddmdh-\r\n" + 
							"         .+yyyyyyhyyysosoo+oosssoooosyddyyyso++ooosssssssss:+ssyyhdhhhyssoyhyhhhhhddhdhhyoyhhhdddhhhdyosssshddyysssssydmhsooyoyo./yyysossssyyhddyooo+++/:-://:.                                `.-/ooss-\r\n" + 
							"  `   `:shhyyhhyyyyyhhddhhysooososoohddysso+++oooosssssoss-/osyhhddhyys++sysyyhyyhhhyhhyyyysyhdhhhhhhhooooosyhddhosssyhmhyoossoy-:ooysssyyyhysdds+/:://:::::o//`                                      ` \r\n" + 
							"     :yhyysosssoossooossyhddhyssoooydmysso+/+++ooooosoooo--osyyhdhhyyo+/ssosshhyyysyhhyoosysoydhhhhhyysyyyhhhdhydyoosohmhysooyo+`-+ossysssss::ydmhssssossosss++                                         \r\n" + 
							"   .ohosssssssooooossssssosyhdddhhdddyoso+++++oosssssssso:+ssyyhdhyss++oyshsoshyyhhysosdmdmdoohhyyyhyyyhhddhhhhhyyo+ooymhysooss+  `:oyysys+//+yhmdyo+ossyosysy/`                                        \r\n" + 
							"   /dmyossssooo+++++oooososoosyhhddhysoo+++++oosssssssssssoshhhhhyyyso++osyysosyhyoshmmdmmdhssoyhyyyyyyhdddhyssssosoosyddysssoos-   .+sso+/+osyhddhso+oooyyshs/--`                                      \r\n" + 
							"    .smmdysso+++++++++++oosssssssoossooo+/++oooossssssssosssshdhdhyyssoo++osyhhysydmddddddhhdho+ohyyyyyyyhdmdhysosoo+oyhmmddhhyys-   `oo+o+osyhhdddhs++shyyddyo//+.                                     \r\n" + 
							" `    ./sydhhyysssooooooo+ooosososssooo///++oooooosssssssssssssyhhhyyyssooshyyyddddhdddhyhyysoso+syyyyyyysyyhdddyyso+osyyhhdddddhh:   -yysyyhyhhhddhyyyyyddmdhsoy++.                                    \r\n" + 
							"          `-/osyyhhhhhhhdhhddhhhyoos+ossyyhdddddhhhyysssssssssooshdhhhhhyysshhydhhyhhyyhyhhhhyyso+syysyyyssssyyhdddhyoo+osshhsysyss.   -+os+oyhyyysyhhdmmmmdyydysho/-                                   \r\n" + 
							"                ```......-.-./hhoooooyy//::-----::/+yhdhyysossoo+oo:oso+syhsysoyyyyhhhdhhhhddmmmdyoysyyyyyssssssoshddhyssssyyyhhh+`       `ydddmddddmmmddyyysyyyosho//:                                 \r\n" + 
							"                         ` `+hhhhhyhyd+              `:+hddyssoooo++soddsdhsod/sdddhddddmmmmdhhysoosssssyyssssso:--/shdhhdddhy+:.`         /ddmdmdddddhhhyyyy+yyhhs+yo`                                 \r\n" + 
							"                             ``.-----.`                 `+mhsooo+oo+++ohh+sysysyddddddddhysssssy+/oosssssyssssso:-.  ./oso/-``           ` `+ddyhhddmddhhhshhyydhyyhs/-`                                \r\n" + 
							"                                                         /mdho++++++++++yhhhddddhhhhhhhdys+/+osys:/ooooysssossso/-.    ``                   -+yhhhhhhhyyyhyyhhhhdddyy/+`                                \r\n" + 
							"                                                         `.:dhyssyssyssyyyyhdhs/ssyhddddyys+/ossso:+o+ossssoosso+--`   `                      -hhhddhdhddddhhddmdmyshyo/`                               \r\n" + 
							"                                                            :/++ooossssssssyssooosyhdddhhyyo++ssso//oosyyhh++sss+.-                         ` `yhhhdddmdddmmmmdmmdshhyoo/                               \r\n" + 
							"                                                                    ```` `` `/osssyhhhhhdhys++osso+:sddhysssssssssh-                          .+oydhdmdmddmmmmdmdyyhyso:/-                              \r\n" + 
							"                                                                             +osyyyhdddddhysooosys+//-.```-yhyyys+/`                            `.shhhdhhddhhhhyhdddyso+:+.                             \r\n" + 
							"                                                                            `+osyhhhhhhhddhhyoooss+//.     `...``                                ` -yyyyyyhhhddddddmhyyo///`                            \r\n" + 
							"                                                                             +sysyhhyhhhhhhhhhyyyhsoo+--.  `                                       `-ssoyyyyhhdddddddyys++/-                            \r\n" + 
							"                                                                            `ooyyhhhhhhyhyyhhyhddhhsosooo//:.`                                       .ssosyyhhdddddddhyyso//.                           \r\n" + 
							"                                                                            .yshyhhhhhhhhhhhyyhdsmsddy+hdo++o:                                        .ososyyyhdhdddddhsso+/:`                          \r\n" + 
							"                                                                            .ssyhhhhhhdhhhhhhyhdhhsmh+hhd-  ``                                        ``osooyyhddhhdhhhyso+++:                          \r\n" + 
							"                                                                     `    .:oosshhhhhhdddmddhyhhyhhyysso+`                                              .ssydhyhyyhhyyyyysoso/` `                       \r\n" + 
							"                                                                `      `-/oooyhhhhhysssyhdmdmmdhhyyydhs/:                                               :shdhyhhyyyyyyssssyyoo/--`                      \r\n" + 
							"                                                             ...--.``./o+oyhdhhyyyyso+//+shyddNdyshyhho//````````````                                  `yhsyhhhhhhhyyyyyyosssssoo-                      \r\n" + 
							"                                                          ` -o+oyddyyyysyhhhhhyysso++/+oosshydmmdsshhyoo/....``..``````````                           `.hyhhhhhhddhhhhyyhsososshh+`                     \r\n" + 
							"                                                            `s+syhhhhhhhyso+osysooo+ooossssyyhdddyyhso+----.........``````````  ```               `    /dyyhhyhdddddhyyhhysysysymh.                     \r\n" + 
							"                                                      ```````/hhdhhhhhhhhhyyso++++ooooosyyysshyso+/:--------............```````````````````````````   `:/-osshyyddhhyyo+oyyyyhysd/                      \r\n" + 
							"                                               ``````````````.+ddhhhhhhdhdddhhhysooosssso/:--:------::-:-----...................................`.``-:.`.+yyyhhhddhhyso+++ooyyhss:`                     \r\n" + 
							"                                           `````````````.`.....-ossyyyyyyyyyyyhhhyysso/:--------:------------.................-----------------.-..:yhs/+shyyhyhdhhyyyso+oo+/+yy/+- `````` `            \r\n" + 
							"                                       `````````````````........--:::::::::::::-------------------------..........................---------------.-ooyyo/+osssyhhhyssys+++oo+oyyoo.```.```````          \r\n" + 
							"                                            ``````````````````````..``````.....................`........``````````````````......................../soyyyyyyssssssyysssso+oso+syh+:.........```          \r\n" + 
							"                                                         `````````````````````````````````````  ```````````          ```````````````````........./hyhydddddddhhyyyssooososs+oyo--.--..-....````         \r\n" + 
							"                                                                               `                                                ``````````````````-:..dmddmmmddmddhhyssso+o+ss:------.-.````````        \r\n" + 
							"                                                                                                                                  ````````````````..`.+hyhhddmddddhhdddhss++o/----....```````           \r\n" + 
							"                                                                                                                                     `````````````..`.-/+ossyyyyysssyysso+/::.`....``````               \r\n" + 
							"                                                                                                                                            ``````````````..-:::---.....`````````````                   \r\n" + 
							"                                                                                                                                              `` ` ```` ````````````````````````                        \r\n" + 
							"                                                                                                                                                                                                        \r\n" + 
							"                                                                                                                                                                                                        \r\n" + 
							"");
					System.out.println(" ");
				}
			else if(option == 4)
				{
					System.out.println("You have chosen Archer.");
					System.out.println("                                                                                           ```      `                                                                                        \r\n" + 
							"                                                                                                      `:/-`                                                                                             \r\n" + 
							"                                                                                                        .+o-`                                                                                           \r\n" + 
							"                                                                                                         `:ss:`                                                                                         \r\n" + 
							"                                                                                                           .ohs:`  `                                                                                    \r\n" + 
							"                                                                                                            `:ydy+///-`                                                                                 \r\n" + 
							"                                                                                                             `:ymdysoo/`                                                                                \r\n" + 
							"                                                                                                            `./oshdmhs+.                                                                                \r\n" + 
							"                                                                                                           `---+ooyhNNdo-`                                                                              \r\n" + 
							"                                                                                                         `.-`  `.-/+ymNNd+-``                   .                                                       \r\n" + 
							"                                                                                                        .-.`   `--``.+hNMNdhs+:.`               -:. `                                                   \r\n" + 
							"                                                                                                      `.-``  `.-.`   `-sdNNMNNmh+               `:+-`                                                   \r\n" + 
							"                                                                                                     `-.`   `--`      `-ohMMMMMNh-                -s+.                                                  \r\n" + 
							"                                                                                                   `.-`   `--`         `/hMMMMMNNo`                .ss-`                                                \r\n" + 
							"                                                                                                  `..`  `...`           .+yhmNMMMNy:`               .oy/.                                               \r\n" + 
							"                                                                                                `..`   `-.`               `.-/hNMMMms-             ` `+y+-`                                             \r\n" + 
							"                                                                                               .-.`  `..`                     .+dNMMMdo.`             `:sy/.`                                           \r\n" + 
							"                                                                                             `..`  `..`                         -omNNMNd+.             `:sho:`                                          \r\n" + 
							"                                                                                            .-.   .-.`                           `-odNMMNh/.            `.ohy+.`                                        \r\n" + 
							"                                                                                          `..` `.--`                               `-sdNMMNy/.`           ./yhs:`                                       \r\n" + 
							"                                                                                        `.-.` `--.                                   `:smNMMNho-`          `:shy/-`                                     \r\n" + 
							"                                                                                       `--` `.-.`                                      .+dNNMMNds:.`        `-odho:.`                                   \r\n" + 
							"                                                                                     `.-. `.-.`                                         `/ydNMMNNdyo:`       `.+dds/-`                                  \r\n" + 
							"                                                                                    `-.` `--`                                             -oymNMMNNmdo:.`      `+hyso:.`                           ``   \r\n" + 
							"                                                                                   .-` `.-.`                                       `       .+yhNMMNmmNdy+:-.``  `/+ys+/-.`                      ```.``  \r\n" + 
							"                                                                                 `-.` `..`                                                  `/yydNMNmhdNmmdhyo/-.``/++s+//-`                 ..--.`     \r\n" + 
							"                                                                                .-` `-.`                                                     `:oshNMMNmhdNNNNmmhyo::+yhyoo+/.`          ``.-:/:`        \r\n" + 
							"                                                                              `-. `--`                                                         .+oymNMMMdhhdmmNNmy::oosyhs++o+.     ``.--/oo/.`         \r\n" + 
							"                                                                            `..` `-.`                                                           .+symNMMNmhssymMNs.`/ys++osyds`  `.:::/:/+/.`           \r\n" + 
							"                                                                           `-. `-.`                                                             `:oohmNMmdddhyhmNms:-:ohNMNNmy-..-/yho++/.              \r\n" + 
							"                                                                         `.-``..`                                                                .+oshmNMNMMMNmNMMNd+/sdNNNNdsyhhddmmy/.`               \r\n" + 
							"                                                                        .-.`.-`                                                                   :hdmNdhhNMNNNNNNNNmhyyyhdmdysodds/:.                  \r\n" + 
							"                                                                      `..`.-.`                                                                    .+sss/:+hhsshdddmmyyysssshNNmdNh-`     `              \r\n" + 
							"                                                                     `-``-.`                                                                         ``   `.-++ohdmdhhho-`./shmNMmho:                   \r\n" + 
							"                                                                   `..`...`                                                                               `/oyhddddhhhhy/`  `.:sds//+.                  \r\n" + 
							"                                                                  `-``..                                                                                 `/+sddsyysyyyyo-`   `/dmdy+::                  \r\n" + 
							"                                                                 ..`..                                                                                  `/dmmdyoosyyyso:`     `:ohdh+/`                 \r\n" + 
							"                                                               .....`                                                                                  `/hNNmyssyyso/.`          `-+ss-                 \r\n" + 
							"                                                             `..`..`                                                                                  `+hNNdysss+:.`               `.-:`                \r\n" + 
							"                                                            ..`..                                                                                   `-ohmmhhhyo-`                   `     `             \r\n" + 
							"                                                          `-.-.`    `                                                                             `-+ymNddhhs/`                                         \r\n" + 
							"                                                        `.-+-`    `.``.`                                                                        `-+sdNNmmdy+.`                                          \r\n" + 
							"                                                       `...+o:-.-:+yhhhyo/.``                                                                `./sydNmmNNho-`                                            \r\n" + 
							"                                                     `.--.`-y//osyhhdmmmNNmy/.                                                            `.:+sydmNhdNNhs-`                                             \r\n" + 
							"                                                    `-/ooso/sho+sdmhhmmNNNMMMm+.`                                                      `.-odh+dNmdydNmhs:`                                              \r\n" + 
							"                                                   .-:/oymNNNNmhhdNNNmNMMMMMMMMd-                                                   ``/yddyds+oyo//ymhy:`                                               \r\n" + 
							"                                                .---:../yydNNNNNNNNmmmMMNMMNNNNMh.                                                 `:sdmNh/ohy+sossoyy:`                                                \r\n" + 
							"                                               `-+:-+:.```:sdmNNNNNNNNddmNMNNNNMMo`                                              `-+dmmhyydsshoddhohh/`                                                 \r\n" + 
							"                                          ``  `:++ooys:-``:osddmmmmNNNNmddmmNNMNMh.                                             .hNMMNMhyhsmdmhdmNmhd/`                                                 \r\n" + 
							"                                         `-/--:-/o+osy+:ossyyyhdddmNdddmmmddhdmNMh.                                             `hMMMMMNhdmNMhyhhhhhd/`                                                 \r\n" + 
							"                      ```..-::..-/::-::-.`./+os/.+oo+sy+sdNNNNNNMMNMNddmddyyyhhhhy.                                              :dmNMMNNMMMMhyyddmdh/`                                                 \r\n" + 
							"                    `.```...-/+ohmmmmddddyoooyyo::/+o/+/sNMmmNNMMMMMNy+//oshdyhdddo/-`                                            `/sMMMMMMMNhhhddhyy-                                                  \r\n" + 
							"                   `...-.`.++yhdNNmNmmmmmdmmddmdhddhhhyssyyhdNMMNMNNm/++:/ohs/ymdhyo:`                                             -dNNmddNNNmddyso/s/.                                                 \r\n" + 
							"                    `.::.`/ysyddNNmmdhhddhhsssssyhsoyhssyhhyhmMMNNmmdyssssssssyyso+/::---.....``````                               .+osddmmdddho/:/+yy:`                                                \r\n" + 
							"                   ``./yysdmssysdNNmddmmdddyy+/+so/`./oyddmmNMMMMMNNdo+////:::.---::::://///++++++++++++++//::/::::----.....````````:hdhhsymNdo:/hmNNds-`                                               \r\n" + 
							"                     `-odmNMNmNmNNddmmmmNNmdyhmmdho.`-yshdy:ydhdmmNhyo///+//--..::````````.--```````````.......------:::::://///++//+ohhmysymNoymNNmNNdo-....``..--..```                                \r\n" + 
							"                      `-+ssssssdNNmmNNmmNNNmdydNNNh+.-ymmy:+yyyyyysos++/:oo+:/+/o+---.--..ommo.        `.:++/++//:::--.......-/o/`.-.shddys+-/yNMNmmmdmdyooo++/:--/++/::-.`                             \r\n" + 
							"                        ````  .yNNNNNNNmmmmmmhydNNdy/+mMm/sNNNmhsoydmsooysso+yo////+:..-:/syhyo+//----::/shhyooshhyyyss+o+syyyy+.+hysNmddhhhyo-+hsoyhdhhmmmdhs+:-----..```                              \r\n" + 
							"                              `+yhdmmNNNNNNNNNdhddso/odMm/odhyyhhmmdmmssyhyhhs/:::+sooosydmdmmNNNmhhhsysomNmyshsmNNNNmdosossydh:/NNNddhy:dmmdh-`````-//ohmmddhso+:-``                                   \r\n" + 
							"                               ```..--/sdNNNmddhyosoyhdNNhyhhhhdmddmmdohddmhhhoysyhhdmdhdNNMMMMMMMNNNmhssmmNhsyyNNNNNmmdddhymNd:smNmdymd.hmmmy.` -:/ossyhydhs/+syo//:.`                                 \r\n" + 
							"                                       `./syyyhs/+ymddmmNmhmhyhmmdmdhsyddhdmmhdmyhmNNmmmNNMMMMMMMMMMMNmyymmNdyhdNMNNNNNNNNNhNNmodmNmmdNm.yhmmo` `/hmddhhyydddysso:-...``                                \r\n" + 
							"                                          `-oy+:/+shhdmNNNNNhyhmsydyyddmmmNmmmmddmNNNmNNNNNMMMNNNmmmmNNdyhhNNmNNNMMNNNNNNNmdNNmdNNNmNmNd.hydy.`...:oyyydmmmmmy+:.````                                   \r\n" + 
							"                                           `-:-:/+osooshdddhhyyysyhhhddmmmNNNNmNNNNNNNNMMNNMMh/-----::++oosdmmmdhysso+//::::++oydh+///o/-oys:./sso++++sdmmNh+-.``                                       \r\n" + 
							"                                            `..--://+oossyyy+/oydhdhhhmNmmmNNNNmmhyyyhdmNmddy:`         ``.-....````        ` ``.` `   `..+o:+ydhddddhsoydyo:.`                                         \r\n" + 
							"                                           ```.-:+ooosydhysoosydmmddddhddmmmho/:-.```..-:-..``                                        ``-:/++osymNNNmhs/:/:-.`                                          \r\n" + 
							"                                          `...-+shddhyyssoosyhdmmmmddhyhdmm+.`                                                    `---:+ooyhmhhsyhddmh+.`                                               \r\n" + 
							"                                          `--:sdmNNNmyysysyhydhmmmmdhhhhdmd-`                                                     -dmmddmNNMMmddhysyy/`                                                 \r\n" + 
							"                                           `.omNNNNNNmhdhhNmdmdmmmhdhhhddd+`                                                      /NNNmNNMNNNMNNNhyy/.`                                                 \r\n" + 
							"                                           `.oNMMNNNNNmdmddNmmNmmNmdhhddh/`                                                    `.-dNMdyyymNNNNNMMdho.                                                   \r\n" + 
							"                                           `-/hNNNNNNNNmhmhdmmNNNmdhhhdy:`                                                    `:sdMMMyyyhmhmdhmNNhhs.                                                   \r\n" + 
							"                                           .:/ymNNNNNNNmdhmhhddmNhhhdhd+`                                                     -dNMMMNhhhNdhhohhyhdhs.                                                   \r\n" + 
							"                                           `-/+hNNMMNNNNNddmhhddNhyhdmdy.                                                     `/dNMMmmNmmhNd+sysshho.                                                   \r\n" + 
							"                                           `-/:smNMMMMMNNNddmhhmdmddmmNN+`                                                      .ommNMMmdmmmyhsoshh+`                                                   \r\n" + 
							"                                            `.-+ymMMMMNNNNmhdmyhddddmNNMd-`                                                      `:+sNNdNMddmhyooyhs.                                                   \r\n" + 
							"                                             `-/sdNNMMNNNNNmhdmyhdddmNMMMs`                                                       `./NmmNMhmMMMNNMNh+`                                                  \r\n" + 
							"                                             `.:ohmNNMMNNNNmdyddhhddmNNNMM:`                                                        `omNNmdNMMMMNMMmy:`                                                 \r\n" + 
							"                                             `-+shmNNNMNNNNNmdymmyhmmNmNMMd.                                                        ` `+hmmdNMMMMNNNds-                                                 \r\n" + 
							"                                            `.:+shddmNNNNNNNNNdhNNddmmNNNNMo`                                                            -shdmNMMMNNNho.                                                \r\n" + 
							"                                            `.-:+oyydmNNNNNNNNNddNmhhmmmNMMNs.                                                             .:shmNMMMNNh+.                                               \r\n" + 
							"                                           `/yhhyhmNNNNNNNNNmNmdhhmdyhddhdNMM:`                                                              `:shmMMMNNd+-`                                             \r\n" + 
							"                                          ``.:/oshhodNNmNNNmmdmhyyyydyhddhmNM/`                                                                -+sdNMMNMms:`                                            \r\n" + 
							"                                          ./++osssyhmmdmmmmmdmmmdmydNNydNmmNNd/`                                                                `:ohNMMNMNy/.                                           \r\n" + 
							"                                         `.:/++osyhhhyyhmmmmmmmNNNmydmmhhmNNmNy.                                                                  .:yNMMMMNdo-`                                         \r\n" + 
							"                                        ``..-/+oyhhdmmNNNNNNNNNNNmmdymmmhdmmmNms:`                                                                 ./yNMMNNNNho-`                   `                   \r\n" + 
							"                                       ``.--:+osyyhdmNNNNNNNNNNNNmmmmhmmmyhmmmmmmy/`                                                                .+ddhddyymNdo/-`             `.-.                   \r\n" + 
							"                                     ``..-:/+osyyhdmNNNNNNNNNNNNNmmmmdhdmdhdmmmmmmmh:`                                                              `-syhmNmdddhddh+-`         `./o/`                   \r\n" + 
							"                                    ``.--:+syhhhddmmNNNNNNNNNNNNmmmmmmhhmmmhdmdmmNmmmo.                                                              /ydNNNmmmdysshy/.      ``-:/:/-                    \r\n" + 
							"                                   ``.--:+oyhhhhdmmNNNNNNNNNNNNNNNmNmNNhhmmdhhmNNmhhdmh/`                                                            ``:ymNNmddhshhy+-    ./sso+::-`                    \r\n" + 
							"                                  ``..-:/ossyyssyyhddmNNNNNNNNNNNNNNNmmmyddddhhdmdddmmmmy:`                                                    ````    .:+dmNmddshhy+.  ``/hNMNdo+-                     \r\n" + 
							"                                  ``.-/+osyyhhhhhhhhhhhddmmmmmmmmNmmmmmmmhddddhhdddddmmNmmy/.`                                               `..-://+/:/oymmmmNdyhdy+-.:shdmmNMNdo`                     \r\n" + 
							"                                 ``.:+osyhddmmNNNNNNNNNNNNNNNNNNNNmNmNNNNmddmmmddmmmmNNmmmmNh:                                               -:-+oomNmhmNmdmmmNmdhhhhysoyyoosmh:.`                      \r\n" + 
							"                            ``.`.-.-//+oo+syyydhhhdhdhhNmdmmNNNmNmNNNmNNNNmdmmdmddmmmmmmmmms-`                                              `--+oomNmdddyyhddmNNmddmdddo+o+odNh:.`                      \r\n" + 
							"                           ./osyy/-:+syhhhdmddddhssydyhmdhmdmNmydmNmdhhhhdmmdmmNNhhhyhdmNNs.                                               `../oomMNmhyyoyNNNNNy:-/hmNmdmmmNMNdhhy/`                    \r\n" + 
							"                           `:oyds-`-odmmmdhhdmNMm+//sNMNy/dNMNh:`-/dmo//+ohNmmNNmdhhhhhddddo.                                             ``.//omNNdsydhhddds+:..-:+osyymms/+hmdddo+-`                  \r\n" + 
							"                             ``.-`./shmmdhyyyshmmo/sNMMmo+NMNNs`  `ommh+++hmmhhmNNmhhyhhhyhho.                                           ``./:sNmhyhmNNNNNmds:.``.:+ossoys. `:shddso+:`                 \r\n" + 
							"                               ``./shhhhhhhyyhhddy:+soo+:oMMNN+   `.-:--./yydmdNMNNmhyyydmdddo-.`                                       `.://hmhydmNMNNNmmmhso/:.-/o+:/hho-  ``-+hdhs/:-`               \r\n" + 
							"                              `.:+syhhhhyhdyyhdddy:``  `-sMMNm/          -ydNNmdmmdmNdhyydmdhssyo.                                    ` ./:+ddhdNNNNmddddhhyo+-`./yo+syhy:`      `-/shhyo-`             \r\n" + 
							"                             `.:ohmNmdhyyddhyyhdms.    `-yMMNm/           :hmmmNddmNmmdhdmdysyyyy:`                                 ` `:::sddmNNmdhhhyso+/:..`.-/oo+sho-`           `-+yhs:``           \r\n" + 
							"                           ``..-:ohmmmmddmmmdyhho.     `:dMMNd:            `/hNNdymmNNmhhyssyssyho/-`                              ``-::/hhmNNmhhs+:-.`       ::/+++/-`                `-+ys/.          \r\n" + 
							"                           .:::+shdmmdhddddmdhy+.      ./dMNNy-`             .oysydmmhyyyhhysssyyhdh/`.//`                        `.:/+smmNmhys+:.`         `-///+:.`                     `:ss/.`       \r\n" + 
							"                          `-++ohdmNmdhhyyyhhmh/`       `/dMMNh.               ``/smhsydmmhhhyyyyyyddo.:hd:                       `-:/hmNNdys+:.`           .:///:.                          `./o/`      \r\n" + 
							"                 `       ``-//smNNNdhyyyysshh/`        `:hMMNh-                  -sydNNNmmhhdhyyyyyhhhhdNs.                    `-:/yNNmds+:.`            `:/++/-`                              `-:`     \r\n" + 
							"                   -/-``.::-:oymNNmdhyyyysydy.         `-sMMNm/                   .ohmNNNmmdddhyyhhdddmmmd:                  `.:/yNMmso:.`             `./+oo:`                                         \r\n" + 
							"                  .oso-`-/::shdmNmddhhhyshdh+`          -sMMNNs`                   `-+hddmNmhsydmmddhhdmmd+                `.:/yNNds:.`            `  `:+ss/.`                                          \r\n" + 
							"                  `/so:`./+sdmmmmmmddhhhdho-`          `.+NMMmy`                     `:+hNNdddmmmNdyyhhhmms.`            `-:/yNNdo.`                 ./os+.`                                            \r\n" + 
							"                  `/oo/:+oshmmNMMNmmdhhdy-`             .+hMMNd-                      `-:shdNNmmmmmmdyyhdmds/-         .--+hNNdo-`                  -+so-`                                              \r\n" + 
							"                  `+oo/oo+odmmNMMNNNmdhs-               `:shMMNh:                      `-./hNNNmmNmNNdyymNNmy/`     `.-/+hNNdo.`                  `/ss/`                                                \r\n" + 
							"                 ``-+oo/--oyhmNddmNNNms-                 ./odMMNh:                      ://+ymMNmmNmmNNmmmmmdo.```.::+ymNNdo-`                   -os+.                                                  \r\n" + 
							"                `.../so//syhmNdhhdmNNh:.`                 .+sdMNmh/.                    `-smdmNNNmmNMMNNNddmdo-/+oshmmNNdo.`                   `/so.`                                                   \r\n" + 
							"                `--:oo+sddhmNmhdddmmh/-.`                 ``/ydNMNmd+`                    -ymNNNMNmNMNNNNddmh/+smNNmdmmy-`                    .oo-`                                                     \r\n" + 
							"                 .-/sy+ymdmNNNNNmmmdo.`                     `-/+yhddy-                    `-+ymNNNNmmNNNNNNd+/sNMNdyydy.                    `/o/``                                                      \r\n" + 
							"                 .-:ymdmdmNMNMNNNNmy/`                          ``...                      `--:osoymmmNNNNdo/smMMMNhhh:`                   -++.                                                         \r\n" + 
							"               `.-/shmNNNNNNNNNmddh/`                                                       `-.```-sNmmNmy++ydmNNNmhs/`                  `:/.`                                                          \r\n" + 
							"              `::+yhdmmNNNNmmmy///.                                                          .-.  `-sddyo+shmmddhdh/``                  `:-`                                                            \r\n" + 
							"             `-+syhdmmNMMNNNNh:``                                                             .-../sys++ohddddddddd+`                 `..`                                                              \r\n" + 
							"             `-/shmmmNNNNmmdy:`                                                                ./oss+/oydhhmNmmmdddh:`   `            `.                                                                \r\n" + 
							"             `/sydNmNNNmmmds-`                                                                  /yo/oyhyyyhmMNNmmmddy-`                                                                                 \r\n" + 
							"             `/sdNNNNNmmmd+.                                                                    -+osyyysso+ymNNNNmmdds.                                                                                 \r\n" + 
							"            `-+ymNNNNNmdo-`                                                                   `./ooossss+-``:ymNNNmmmmy.`                                                                               \r\n" + 
							"            ./shNNNNmms-`                                                                   `./o+-``...``    `/hNNNNmddy:`                                                                              \r\n" + 
							"           .:ohmNNNmh/.                                                                    ./o+-`             `-smNNNmddy:                                                                              \r\n" + 
							"         ..-odNNNNmy-`                                                                   .:o/.`                `:ydNNNmdds/+:                                                                           \r\n" + 
							"        `.:/ymNNmmh-                                                                   `-/:.                    `:ydNNmdddhmh.                                                                          \r\n" + 
							"       ./oyhmmNmdm+`                                                                  `..`                      `:symmmdhhhdd+`                                                                         \r\n" + 
							"   `   odmNmmmddmd/``                                                                                           `:ssshhyyhdddd/                                                                         \r\n" + 
							"      `./sdmdddddm+`                                                                                             ./o+/ssydhhyhh/` ``                                                                    \r\n" + 
							"     `-:/ymmdddmmm+.                                                                                             `/oosyyhhdhs+/os+so-                                                                   \r\n" + 
							"   ``-/+hhdddddNNh-                                                                                              `-/shsoyhddo-/+hmmh-                                                                   \r\n" + 
							"` -yyddNNmdddddmmo.                                                                                                 `.:ososyosmNNddy`                                                                   \r\n" + 
							" `sNmmmmmmddddh+-`                                                                                                     `.:/oydmddyo/`                                                                   \r\n" + 
							"  :ymmhdhdhhho.                                                                                                      `                                                                                  \r\n" + 
							" `.oyhhyso/:-``                                                                                                                `                                                                        \r\n" + 
							"\r\n" + 
							"\r\n" + 
							"");
					System.out.println(" ");
				}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
			
			System.out.println("//n-------------------------------------------------------------------------------------n//");
			System.out.println("Your adventure begins!");
			System.out.println(" ");
			System.out.println("You are right outside a town gate, and you see a guard.");
			System.out.println("What do you want to do.");
			System.out.println(" ");
			System.out.println("1: Walk into town.");
			System.out.println("2: Just quit.");
			System.out.println("3 attack the guard.");
			System.out.println(" ");
			System.out.println("What would you like to do?");
			System.out.println("Achievment get: Start of an Adventure!!");
			System.out.println("//n-------------------------------------------------------------------------------------n//");
			
			int decision1 = myScanner.nextInt();
			
			if(decision1 == 1)
				{
					System.out.println("Game: You walk into the town.");
					System.out.println(" ");
					System.out.println("                                                                                                                                                              \r\n" + 
							"                                                                                                                                                                                                        \r\n" + 
							"                                                                        ````````     ```````````.....----------...--.........----.-----:------.                                                         \r\n" + 
							"                                                `-//::-:--:--/:::://:://++ooosso+oo//ooo+oooo+sss+oyoosoosyysossssyoosssoo+o+oooooyysoossssyso+.                                                        \r\n" + 
							"                                               `:oyssysyyyyyssossoyhhsyyyyyyyyyhyydhoo++oo+ooodyo+sh+ooosoysoo+ssosoosshs+o+/+o++sdhssooossyos+.                                                        \r\n" + 
							"                                              `:oooossoossyso++ssssysyyyyyyyyyyyyhhs+++oos:+/shyo+ss/o+osoyo+/+so+o+ossho/o+/++/:ohhss+sooss+oo-                                                        \r\n" + 
							"                                             `:oooosoosssys+s+ooysssydhyysyyysyyyhyo/o+oo///+hhyo+s+so/+osyo++ooo+/+syyh/:+o++o+/oyhsoososys+so-                                                        \r\n" + 
							"                                            `/+oyossssyyhhoooo+ssosshhyyysyyyyyyhhy+//ooo/+:ohhyo/s/o/:++yyo+++oo++osyhy::o+/:+/+syysooyssyoss+:`                                                       \r\n" + 
							"                                          `.+sosssooosyhdsos+sosssyyhhyhyyyysyyyhhyoo+s+oo::+hhso+ss//+++yys+oooos/osyds:/so////+ohyoyossysssoo/`                                                       \r\n" + 
							"                                         `:+oos+ss+oooymoso/yo+ossyhhhydyhhdyyhsyhhyyhhhhhs++soso+od-+h+/hys+ohs+hooshy:o/y/+y+:+ohyoss/ohosy++/`                                                       \r\n" + 
							"                                         `+hhhdhdhhddhdhosysdyyhhhhdmmdmdmmNmdmdsNmmhhmdmmmNhooshyyNysyyohmdhddhhddmhhssyshsohhoyyymdhhyddhydso+`                                                       \r\n" + 
							"                                          .--::ommhdmdmhyhhhddddhdhhdmmmdddmmmmdddddmmmmdddddmdddddddhhddddmdddddmmmdmhydddhdhsyhhydmdmdmmdddyo-                                                        \r\n" + 
							"                                               :hmdmmdmdddddddddddddddddddhhhhhhhhhhhyhyyyhhhhhhhhhdhhyhhhhhhhhhdddhdhhdmmdddddmmdddddddddddds:`                                                        \r\n" + 
							"                                               `ommmmmNNmmmmymmmmNmmmmmNNmmmmmmmmmNNmmNNNNNmmdNNmmdmmddmmdmmdmddmdmhdmNNNNNMNMMNmmdmmdddmddmy/`                                                         \r\n" + 
							"                                               `:dNmmhmmNmdddmNNNmmmmmddhhyhmNNmmhyyo/::+:-:hmNMdmmhNdhdddmdhmdddhmydmMNmmmNNNNNmdddddddddhmy:`                                                         \r\n" + 
							"                                                -ymdNhdMMNy:so+//:----...```://:+/o:-`-+ys--ydNMmddhNdhmddmddmNddymhmmNMmNmmmmmNNNNNNNNdydhms-                                                          \r\n" + 
							"                                                .oNmdddNNNd/y+:-..--.-.--:.::/:+yy/+-`..::`-sdNMmddysooosooo+/---.+s+oyddmmmmmdNmmNNNNmdymhdy-`                                                         \r\n" + 
							"                                                `+mddmdmNNNs`..``.+ysh:sos++/++::o:/- `````-yhNmmdNs``````:s/`...`-/```.`-+++sydmdNNmNmdyhddy-`                                                         \r\n" + 
							"                                                `/dmmmymmNmN-`````-+:+/-::.:.``````..```-```/yNNdhmNo-.::.---::::.`...-.--/:.``.--+dmmNysdhyh-                                                          \r\n" + 
							"                                                 -hdmhdmmmmNy-`-/----`..`````````  `````:: `-ymmdhhNo`.:::----o/:-.::/:-s/--//-.-`ymdmNhshhdh-                                                          \r\n" + 
							"                                                 `ydmydmdddmh:`.:```.::/:---:+++/-...-.``:` .hmddyydy...:..--/://:.`.-::/:--::-.`:dmdmmNmshhy.                                                          \r\n" + 
							"                                                  ohdyydddddh:..-``.++//+oy/..-:o:soo/+-`:` `yNddyydh-`.------::::``---+---::--..odmddmNmsyhd-                                                          \r\n" + 
							"                                                  :hhhsmddddm+-`.``.+so//os/:.`:/++o//o/.``` sNmdyhdms..-/.---/:::``-:-:::-..-.`:hhddddmmoyyd-                                                          \r\n" + 
							"                                                  :hhhsddhhdmo...``./y/``-s/o/-:/ohs.`:+`    +Nmdhhhhs.--+``...-..``-+:-:/:--:-`/hhddddmmoyyd-                                                          \r\n" + 
							"                                                  -yhdshdhhhds-`.....++-./+.:/oy//so.`+-`` ``:hmdhhhdh:-/s/odhyo+o+--.:o:-///::`+dhhdddmmoyyd-                                                          \r\n" + 
							"                                                  .oydssdhhhds..``````:::yo/:-+o/ss:.`.``````:sNdhhhhmdhyhhyhyddhydh++/o/-.:-:::hdhddddmmoyyd-                                                          \r\n" + 
							"                                                  .oyhssdhyhdy-.`````...:/+::::+syy+/.`` ````-+Nhhhhshhhyshoyoyyhhhysdmdhsoyy--odmdddddmmosyh-                                                          \r\n" + 
							"                                                  `+hdsodhyhdd/....---+://----ohhhdhs+:``````-+Ndyyhsssyyydos+ssysysohmMNmmNmdyyhdhddddmdosyy.                                                          \r\n" + 
							"                                                  `/hhyodhhhdms-..-+/--+oos++:/ssyhdhso:` ````:mmyyysosoyshss+syyo++/+ooo+++///:sdhddddmd+shs.                                                          \r\n" + 
							"                                                  `/hhyohhhhdmm+::-:-.-:+ss+//:-:oyyy/:.` .-..-dmhyysssosooossyyms/s-```..```-+-+ddddddmd+sdo`                                                          \r\n" + 
							"                                                  `:yyhoyhhhhdd::/::-.```-:o++//oo+o/-````.-..-hNhysssssss+ooshsdh--``:+-/:-``.`:hdddddmh+ydo`                                                          \r\n" + 
							"                                                   -hyhohdydyhd/:++:::..```-::/:::/:--://....``sNdyyoysyyyosssysdd:..`.y.//-:.``-ydmdddmy+ydo`                                                          \r\n" + 
							"                                                   -shdohdhmhhm+.------:::-::----/sos+o/+:..```+Ndhd-..-:--::/dyhmo-s/`//-::-```-ymmmdmNsoyd/`                                                          \r\n" + 
							"                                                   .ohdysddhhhmo-..```..-----..-..::-.-.--.---.+mmdN/-.-/-```:dhym+`-:-//oso.`.`.smddmmm+ohm:``                                                         \r\n" + 
							"                                                   .odhhhoshhhdds-/+:```..-.````.````.`.--..-:--ymdN::++//::.+yhyms...:oosy+..-.-hmdddh+syhm:``                                                         \r\n" + 
							"                                                   `odhddyyddhmd+/+:.-.-./h++:``--.--:---.--+/:.+mdN-://+//:`:yyhdy:-:/o://::/+yydddds//hyyN:`                                                          \r\n" + 
							"                                                   `+dmmmhymdhddmy+oshho+hNmmdysoo+yyhyoys/odh+osddN-://+s+:.+hyhhho+:+hooo+ssdmdddmmsoyhyym-.`                                                         \r\n" + 
							"                                                   .+ssds+ommddddddmddddhNNhdshmydhdhmdhmhddyddNNhhm.:://+o/.smsyyhdhdmmNmmmNddddddmmyhhhydd:.                                                          \r\n" + 
							"                                                   .smdyyyyddysyddhdyhhyymNyhysNohhyyhssdohhoyydNhhh//++:/s/.+NyyyyyhmNNdhhmddddmdddy+ohd++/o.                                                          \r\n" + 
							"                                                   .yhymmy/odddysmddhhdhhmMhdysmyyhyydyymhsmshydNhyoNdymdhdhyydyhshdhmNmddhmddmhysydmy//yydy:.`                                                         \r\n" + 
							"                                                   -sddhyyyhyhyhyyyhhhdhhhddhhhhhhdhhhhhhdydyhhhhyyyhhhdhhdhyhhyhhhhyddddddddmdyyyhdh+ydys+ys-   `                                                      \r\n" + 
							"                                                 ``:sddyyssssyysyo+osyhhs++osyhhssoossyhyo++/ohsosyhso+++sysoo+ss++osssooooosysoooyyhsyshysy/-                                                          \r\n" + 
							"                                                  `:hhshmNmyyhyydmdyyyssdNNhsss+hddhyysoymmh+dNy+ysyssydhssyyy+hy/yhsyyoyhyoos+o+/d+ohhhysyho.`                                                         \r\n" + 
							"                                                   -hddhhdssNdmmyyhhhNdysdmosmNNdysyhdNhyhdyssmdoymNdsssshmmhoyyds+hddhyossyhmhsoomy/hhhdhsso.                                                          \r\n" + 
							"                                                   -syyyhdsshhysssyyyysysdh+yyyysyhhhhhyysmmshdmhyysyhddhyyysodhddsssoshmdhsoysoydmms+syssyhs.                                                          \r\n" + 
							"                                                    .---.----------------------------//+/:o+/++yyddmddyysssyhhoosyyhhhyyyyyyyhdhsyyyyyshyyyys-                                                          \r\n" + 
							"                                                                                              .hdddmdddho.```````````.....-...-----::/::///+/.                                                          \r\n" + 
							"                                                                                              .ydddmdddyo.                                                                                              \r\n" + 
							"                                                                                              `sdmdmddhyo.                                                                                              \r\n" + 
							"                                                                                              `sdddmddhyo.                                                                                              \r\n" + 
							"                                                                                              `sdddmddhyo-                                                                                              \r\n" + 
							"                                                                                              `odddmddhys.                                                                                              \r\n" + 
							"                                                                                             ` odmdmhmhhy-                                                                                              \r\n" + 
							"                                                         `````````` ````   ``      ```` `` ``` odddmdddhy:`                                                                                             \r\n" + 
							"                                             ``````````````````````````````````````````````-oo-+hddmddhhy/```````                                                                                       \r\n" + 
							"                                             ````````````````````````````````````````````-/ohmhydddmddhhy/````````````                                                                                  \r\n" + 
							"                                             ``````````````````````..-/////://::::------:oys++hNmmmmdddhyy+//:::-.``````                                                                                \r\n" + 
							"                                               ``````````````````.-oyyssoooosyyhyhhhhhhyossssshNNmmmmmmdhmyosssyhs++++/:::-...-....````````                                                             \r\n" + 
							"                                                             ```./syyhdhsoooso+oyyhhhhdhysyyhdNNNmmhhsoyyysoossshhyyso++++++ooyyyysssss++/-.``                                                          \r\n" + 
							"                                                              .:osysssyhhhyyyysosyyhhhmNmmddmmmmmmmdyysoohdyyhyhdhssssso++++ossyhyyyhyhsoo+/:.`                                                         \r\n" + 
							"                                                             .+syysoooooshhdhyssyhyyhhdhdmdddddddddhyhyhhdhhyhyyhdhhhhhhysyyso+o++o+ooyysyys+:.                                                         \r\n" + 
							"                                                           `-osssysoo++osyhddhyyyhdhsshhhhhhhhhhhyyyssyyysysssyssssyssyyyyhy++ooooososyysyyss+.                                                         \r\n" + 
							"                                                          ./oooooosoo+/+oyhhhhhyhhhyo+++++syso++ooo+++ssyo+++osooooooosssyyhhyhsyyyyyyssoo+++/-                                                         \r\n" + 
							"                                                         `/oooososyss+o+osyhhhhhyhyssoosso+o++///////://++///++/+/+++oooosyyyyyyyyysssoooso+::-`                                                        \r\n" + 
							"                                                         -ossssssssyyyysssyyyhyyyyyyyssyyso+++++++++//:://+++++o+++osoooossyyhhhhhyyo+o+++/+/:.                                                         \r\n" + 
							"                                                         `--::::://///+++++/+o+++oooo++ooooooo+oooo++++++ossssyosyyyhyyyyhhhhhhdhhhhyssso+/o+:.`                                                        \r\n" + 
							"                                                                          `  ````````````........--..---::///+++oossossssyyyyyyhhyhyyyyysssss/.                                                         \r\n" + 
							"                                                                                                                        ```````.........-----.                                                          \r\n" + 
							"                                                                                                                                                                                                        ");
					
					System.out.println("//n-------------------------------------------------------------------------------------n//");
					System.out.println("Game: You walk into a bar.");
					System.out.println("Game: You see a list of jobs.");
					System.out.println("Game: You choose an easy level job.");
					System.out.println("Job: Kill nearby monster in forest.");
					System.out.println(" ");
					System.out.println("1: Accept quest.");
					System.out.println("2: Just don't do anything.");
					System.out.println(" ");
					System.out.println("What would you like to do?");
					System.out.println("//n-------------------------------------------------------------------------------------n//");
					
					int decision3 = myScanner.nextInt();
					
					if(decision3 == 1)
						{
							System.out.println("Game: You start to head out to a forest.");
							System.out.println(" ");
							System.out.println(" ");
							System.out.println("//n-------------------------------------------------------------------------------------n//");
							System.out.println("Game When you walk into the forest you encounter slime.");
							System.out.println(" ");
							System.out.println("1: Attack Slime");
							System.out.println("2: Run");
							System.out.println(" ");
							System.out.println("What would you like to do?");
							System.out.println("//n-------------------------------------------------------------------------------------n//");
							
							int decision4 = myScanner.nextInt();
							
							if(decision4 == 1)
								{
									
									System.out.println("                                                                                                                         `                                                                \r\n" + 
											"                          .::.``                                                                                                                                                                        \r\n" + 
											"                          -ooso+/.                                                                                                                                                                      \r\n" + 
											"                     `    -:/osss/.-`                                                                                                                                                                   \r\n" + 
											"                     `    -/+syyssso-                                                                                                                                                                   \r\n" + 
											"                          `./oooshhds:.                                                                                                                                                                 \r\n" + 
											"                           .:+yyhhhhyho`                                                                                                                                                                \r\n" + 
											"                            `.+ysyyyhdho..         `.-.                                                                                                                                                 \r\n" + 
											"                              .ooyyyyhhhy+         ./o+`                                                                `                                                                               \r\n" + 
											"                               `.oyysyyhdh+.`   `.-++os+`                                                                                                                                               \r\n" + 
											"                                 -osyyyhhhhy/``-+ossssyys/.                                                                                                                                             \r\n" + 
											"                                  `-syysyyhhs+ossssssysoss+`                                                                                                                                            \r\n" + 
											"                                    :osyyhyyyyyysssss+.`.-.                                                                                                                                             \r\n" + 
											"                                    `.+yyyyyyyyyysso+/-`                                                                                                                                                \r\n" + 
											"                                   `-/syyyyyyysso++/::/:`                                                                                                                                               \r\n" + 
											"                             ..``.-/oosyyyysssso+++///:/-.                                                                                                                                              \r\n" + 
											"                            ./+//+osooosysoo+osso++/:://:-.                                                                                                                                             \r\n" + 
											"                             .:sssooosso+++++++osso+/://:-`                                                                                                                                             \r\n" + 
											"                               .osss/--//:::///+osso+///::`                                                                                                                                             \r\n" + 
											"                                .sso.  `:/:::///+osso+//:::-...`    ```....------------..````                                                                                                           \r\n" + 
											"                                 .:.`   `-:::::://+osso+//:/:---```.--:-------::::::::--.......````                                                                                                     \r\n" + 
											"                                      `   `--:::::/+osso+/::::-......-----::::::::::::----...........`  `                                                                                               \r\n" + 
											"                                           `-:::/:://osso+:-....-..---:-----:::::::::::::::----....----.``                                                                                              \r\n" + 
											"                                             .--:::::/+/:......-----::::::--------:::::////:::::-----:::--.`                                                                                            \r\n" + 
											"                                              `.--:/:-......--::::::---:::::::::::::://///////::::::::--:::-.`                                                                                          \r\n" + 
											"                                                `.---....--:-::--:::::::::::://////////////////::::::---:::::-.`                                                                                        \r\n" + 
											"                                                `.-....----::::-::::://::///////////////////////::::::---:::--::.`                                                                                      \r\n" + 
											"                                               `.....----::--::::/+++oo/:://////////////////////////:::::::::::::-.`                                                                                    \r\n" + 
											"                                              `.....-::-:::--::++//ooooo+::////////////////////////////:::::-::--:-.`                                                                                   \r\n" + 
											"                                             `...---:::::--:/++/++//+oo+o+/:::///////////////////////////:::-:::::::.`                                                                                  \r\n" + 
											"                                            `....-::::::::/+ooo+/+o+/++ooo+/:-::///////////////////////////::::::::---`                                                                                 \r\n" + 
											"                                           `....-::///::::/+oooo+//++/++++++/:-://///////////////////++///////::-::--:-`                                                                                \r\n" + 
											"                                          `....--:://:::/:::+ooooo+/+o+/+++/++/::////////////////++ooooo+++////::-:::-:-                                                                                \r\n" + 
											"                                         `....--:--::://///::/+o+oo+//++//+++oo+::://///////////+oooooooooo+////::::--:-.                                                                               \r\n" + 
											"                                         `...--::--:::///////:/+ooo++/:++//++ooo+:::////////////ooooooooooo+/////::--::--`                                                                              \r\n" + 
											"                                        `....--::-::://///////:/++++++/:+o+/++o+oo/::://////////ooooooooooo+//////:::::::.            ``.--...``                                                        \r\n" + 
											"                                        ....--:::-:://////////////+++++//++//++++oo+:::////////:++oooooooo+////////::-::--`         `.-:--.```.```                                                      \r\n" + 
											"                                        ....-:-:-:://///////////:://///:://///////+o+/::///////////++++++///////////::--:-.         .:::.``````````                                                     \r\n" + 
											"                                        ....-:-:::://///////////:::::::-::://////////+:-/++++++++///////////////////:::::-.        `:::.```````````                                                     \r\n" + 
											"                                        ....-:-:::///////////::::::::::::////////:::://:+o+ooooooo+++////////////////:::--.        `:::-```````````.```                                                 \r\n" + 
											"                                        ....-:-::://////////:::-::///////////////:::-:::/+oooooooooooo++/////////////:::--.        `-:::-`````````````````                                              \r\n" + 
											"                                        ....-:-:-:///////:::::::///////////////////::::://+ooooooooo+ooo+++//////////::::-.         `:::::-...`````  `  ```                                             \r\n" + 
											"                                       `....-:-:-:///////::-::///////////////////////::////+ooooooooooooooo+/////////::::-.         .::::::::-````    `  ```                                            \r\n" + 
											"                                       `....-:-:-:////////::://:///////::::::///////////////+oooooooooooo+oo++///////::::-.       ```.-::::::.`````      ```                                            \r\n" + 
											"                                       `-----:::::////////::::://syhyy/``  ``-:::::::/++o+//+oooooooooooooo++oo/:////:::::.     `````.-::::::.```````  ````                                             \r\n" + 
											"                                       `--::::::::///////.`````/shhhhh-      ```````.:+oo+//+oooooooooooooooooo+/////:::--.   ``````-:::::::::..``````````                                              \r\n" + 
											"                                       `------::::///////.    `:shhhhho`            .:++o+//+ooooooooooooooooooo+////::::-.```````-::::::::::---..```````                                               \r\n" + 
											"                                       `---:::://////////:`  ``./oyyyyo:--..`     ` -/+oo+//+ooooooooo++++ooooooo+///:::----:-..-::::::::::.`    `````                                                  \r\n" + 
											"                                       `---:://///////////. ` ` .-://////:.`      `.:++oo///+oooo++++//////++ooooo///:::--:::::::::::::::.`                                                             \r\n" + 
											"                                       `----:://///////////. ` `  ``....``       `.:/+oo+//++ooooo+//////////++oo++//::::-:::::::::::::-`                                                               \r\n" + 
											"                                       `---:::::://////++///-```  `         `  `.::+o+++//+ooo+oo+////////////+ooo+//:-::::::::::::::-`                                                                 \r\n" + 
											"                                       `:---::::::////++o+////-``      `    ``.-//+o++///+oooo+oo+////////////+ooo+++/:::::::::::::-`                                                                   \r\n" + 
											"                                       `-----::::://///+oo+///++/:-..```...-::/+ooo+////+ooooo+oo++///////////+o+/++o/:::-:::::::-`                                                                     \r\n" + 
											"                                        -..--::::://////+++/////+++++++//++++oo+++////+o++++oooooo++////////+o+///+oo/:::-:::::-`                                                                       \r\n" + 
											"                                        -...-::::://///////////////////+++++++/////+++ooooooooooooooo++++++o++//+oooo/-::::::-`                                                                         \r\n" + 
											"                                        ....-:::::///////////////++++//////////+++oo+oooooooooooooooo+oooo++//+oo+oo+/:::-:-`                                                                           \r\n" + 
											"                                        ....-:::::///////////////+ooo+oooooooooooooo+oooooooooooooooo++o++//+ooooooo+/::::.`                                                                            \r\n" + 
											"                                        ....-:::::///////////////+ooooooooooooooooooooooooooo+oooooooo++//+oooo++oooo/:::-.                                                                             \r\n" + 
											"                                        ....-:::::///////////////+ooooo+ooooooooooooooooo+++++++++oo++//+oo+oooooooo+/::::.                                                                             \r\n" + 
											"                                        ....-:::::///////////////+oo++++++++++ooooooo+oo+///++++//////++oooooooo++++/::-:-.                                                                             \r\n" + 
											"                                        ....-:::::///////////////++++++++oooo+++oo+ooo++/++o+oooo+++ooo++ooooo++/////::::-.                                                                             \r\n" + 
											"                                        ....-::::://////////+++oo/++++///++oo+++++oooo+/+ooooooooooooooooooo++//+o///::::-.                                                                             \r\n" + 
											"                                       `-----:--:://////+++ooooo+/+++//////+o+++++oooo//+ooooooooo++ooooooo+//++oo+//::::-.                                                                             \r\n" + 
											"                                       `----::--::////+++oooooooo++++++///////+++ooooo+//+oooooooooooooooo+//+o+oo+//::::-.                                                                             \r\n" + 
											"                                       `:---:::-::///+ooooooooooo++ooo+oo+/:/+ooooooooo+//++ooo+oooooooooo+//ooooo+//::::-.                                                                             \r\n" + 
											"                                       `----:::-::///+ooooooooooooo++//++/++++oooooooo+oo+//////++ooooooooo+/+oooo+//::::-.`                                                                            \r\n" + 
											"                                       `--::::--:://+ooooooooooooo++/:/+++++///+oooooooooooo++//+oo+ooooooo+//+ooo+//::::-.`                                                                            \r\n" + 
											"                                       `-:///:::::///+ooo++++++ooo++//+o+o+/////oooooooooooooo+//+oo+++oooo+/++oo++//::::-.                                                                             \r\n" + 
											"                                       `-:://:::::///+oo++/////+++++ooooo+/////+oooo+oooooooooo+//+o+ooo+++//+oooo+//::::-.                                                                             \r\n" + 
											"                                       `--::::::::////++o++++++o++++ooo+o+++//+oooooo+oooooooooo+////++////+oooooo+//:::--.                                                                             \r\n" + 
											"                                       `:-:::-::::///////+ooooooooo++o+/+++ooooooooooooooooooooooo+++++++ooooooooo+//::---.                                                                             \r\n" + 
											"                                       `:-:::--::://///////++++o++o+++++++oooooooooooooooooooooooooooo++ooooooooo++//::---.                                                                             \r\n" + 
											"                                       `:-:::--::://///////////+++++++oo+oooooooooooooooooo+ooooooooooooooooooooo++//::---.                                                                             \r\n" + 
											"                                       `:-::-:::::///////////////+ooooo+oooooooooooo+oooooooo+ooooooooooooooo++ooo+//:-::--                                                                             \r\n" + 
											"                                       `:::-------:::::::::::::::/+//+++oooooo++//++oooooooooooooooooooooooooo+///:::---::.                                                                             \r\n" + 
											"                                       `----.............:::::::::-::::+ooooo/::---:/+ooooooooooooo++++////+oo:-........-:--.``                                                                         \r\n" + 
											"                                      `.-......----------:::::::::::::/+++++++::::::+ooooooooooooooo+/://///+o/---------::::::-.`                                                                       \r\n" + 
											"                                    `.-:--.-::://////:://///++++o+++++o//////++++o+ooooooooooooo+oo++///////+oo+++++/////:://:-:-.`                                                                     \r\n" + 
											"                                  `.-::-::////++//////+oooooooooooo+o++///////+oooooooo++++/++oo+oooo++///++ooo+oooo++///////:::::-.`                                                                   \r\n" + 
											"                                 `.---::///////+////+ooo+oooooooooooooo//////+ooooooooo+o+////oo+oooooo++oooooooooooooo++//////::-:-.                                                                   \r\n" + 
											"                                `.----::::::///:///++ooo+ooo+++++++++++++/+/+++++++++oo+oo+++++o+oo++++++++/+++++++++++++//:::/::-::-```                                                                \r\n" + 
											"                             ``..............---::::/+ooooo+::--.....--.---.--::::-::+oooo+++oo+oo+:-----....-----:::::::--..-::::-::----.`                        ``                                   \r\n" + 
											"                           `.................---:-::/+o+ooo+::-.............----:::::+oo+/////+ooo+:--...........--::-----...-:--::::-:----.`                  `..-..---.`                              \r\n" + 
											"                         `.-....-::::::::://///++++++oooo+oo++++++++++++++++++++++++ooo+///////+ooo++++++++++++++++++++++++++////////:/::-::-.`             ``.-:://////:--``                           \r\n" + 
											"                        `.-:--://////////++ooooo++/+o++ooooooooo+o+///+oooooooooooooo++++//////+oooooooooooooooooooooooooo+oo+///+++++///::-:-.`           `.-://+++++//+/:-....``                      \r\n" + 
											"                 ```....----::/++///////+ooooooo++++oooooooooooo+++///+oooooooooooooooooo+//+++oooooooooooooooooooooooooooooo+///+ooooo+//:-::-...``       .-://+///+o++o+/:-:/::.``                    \r\n" + 
											"               `....-..-----:::///::::://+++++++++++++++++++++++++////++++++++++++++++++++++++++++++++++++++++++++++++++++++++///+++/++/::::-----.--.`   `..--:/+////+++++/:-::::--.....`               \r\n" + 
											"                ``....--..---..-..---.---......---...........----.----...............--...---...................................-.....-.--..-......``        `````````````````````````                  \r\n" + 
											"                   ````````...................----...----...........---...................................----....--.....-................`````                                                         \r\n" + 
											"                                   ```````````````................................................................`````````````````                                                                     ");
									System.out.println("Stats: 5Hp // 1 Damage");
									
									System.out.println("//n-------------------------------------------------------------------------------------n//");
									System.out.println("Game: You attack the Slime.");
									System.out.println(chooseCharacter2.get(1).getHealth() - chooseCharacter1.get(option).getDamage() + " Hp on Slime");
									System.out.println("Game: You have beaten the Slime.");
									System.out.println("Game: The Slime has dropped an item.");
									System.out.println(" ");
									System.out.println("1: Pick up the mysterious item");
									System.out.println("2: Leave it and continue the job");
									System.out.println(" ");
									System.out.println("What would you like to do?");
									System.out.println("//n-------------------------------------------------------------------------------------n//");
									
									int decision5 = myScanner.nextInt();
									
									if(decision5 == 1)
										{
											System.out.println("`````     `````     ````     `````      ````     `````    `````      ````     `````    `````     `````      ````      ````     `````    ``````     ````      ````    ``````     `````    `````     `````\r\n" + 
													"`````     `````     `````     ````      ````     `````     ````     `````     `````     ````      ````     `````     `````     `````     `````     ````     `````    `````      ````     `````     `````\r\n" + 
													"```        ``     `    ```     ` ```   ``         ``         ``   ``````     ``          ````       ``   ``` ``     ``           `          ``   `   ```   ```    `   `        ` ``          ``     `   \r\n" + 
													"     `````     `````     ````      ````     `````     `````    `````     `````     `````    `````     `````      ````     `````     ````      ````     `````     ````      ````     `````     `````     \r\n" + 
													"     `````     `````     ````      ````     `````    ```.::-----````     `````    ``````     ````     `````     `````     `````     ````      ```      `````      ```      ````     `````     `````     \r\n" + 
													"`````     `````     ````      ````     ````      ```` -+yy+:---+o/```````      ````     `````     ````      ````     `````     `````     `````    `````     `````     ````      ````     `````     `````\r\n" + 
													"`````     `````     ````      ````     ````      ````:yhhyoo+++ooso//o+oo++/:::...`     `````    `````      ````     `````     `````     `````    `````     `````     `````     ````      ````     `````\r\n" + 
													"```   ` `` ``     ``  ````  `  ` ````   ``      `` ``shyysoossoosooyhhhhhhhhhhhhyys+/:.````` ````   ```  ``` `` `` ````    `     `` ` `     ``       ````  ````      ``       `````    `    ` ``  `     \r\n" + 
													"     `````     ````      ````     `````     `````   `oyss+-/oyyyyyso:---::///++osyyhhhyyo+:.``````    ``````    `````     `````     ````      ````     `````     ````      ````      ````     `````     \r\n" + 
													"     `````     ````      ````      ````     `````   `ohhhh//syhhhhyo/++ooooooo+//:://ossyyhys+:.``   ```````    `````      ````     ````      ````      ````      ```      ````     `````     `````     \r\n" + 
													"`````     ````      `````     ````      ```      ``-shhdhyssysssossssossssssossyyyyso/:-:/osyyys+:.``.``````````     `````      ````     `````     ````     `````     ````      ````      ````     `````\r\n" + 
													"`````     `````     ````     `````     `````     `:shhdhhysssooooo+////////////+ossyyyyso:--:/syyyyo:-----.-...`     `````     `````     `````     ````     `````     ````      ````     `````     `````\r\n" + 
													"   ``        ````         ``         ``  ````` `.:yhdhyyyyo++//:::--:::::::::::/+ssyyyyyyys:``.:+syyyy+:-------.``  ``  ``   ```     ```      ```  `     `        ````     ```` `  `      `     `  `    \r\n" + 
													"      ````     ````     `````     `````    ```-/ohhhhssso/::-------.---::/+++++/+osyyyyyhhh+`````./osyyyo:--:--.-.```     ````      ````      ````     `````      ````     ````      ````     `````     \r\n" + 
													"      ````     ````      ````      `````  ``-+ssyhhdsos+/::--------::////+++++ossyhhhhhhhhy/`````..-:+syys+:::----```     `````     `````     ```       ````      ```      ````     `````     `````     \r\n" + 
													"`````     `````     ````     `````     ```-+sysoyhhd+oo+//::///////+++oossyyyyhhhhhhhhhhhhy:````.....-:+ssyso/:--.`  `````     `````     `````    `````     `````     `````     `````    `````     `````\r\n" + 
													"`````     `````     ````     `````     `.:ssssooyhhdooo+//+++++osssyyyyyyyyhhhhhhhhhhhhhhho.......-----:/ossys+::.`  `````     `````    `````     `````     `````     `````     `````    `````     `````\r\n" + 
													"   ```  `     ```         ``      ``` ``/sysssooshhdsooooosssyyyyyyyyyyyyhhhhhhddddhhhhhho-....------:-:::+ssyyo:`` ``       ` `     ````               ```                `````     `          ````    \r\n" + 
													"     `````     ````      ````     `````/syyyssssyhhhhyyyyssssyyyyyyyyyyyhhhhdddddddhhhhho:----------:::::::/ossy+.```     `````     ````      ````      ````      ````     `````     ````      ````     \r\n" + 
													"      ````     ````      ````     ``  `+hhhhhhhhhhhhdhyyyyyyyyyyhhhhhhhhhhddddddhhhhhhhy/------:::::::::::///+ooyo.``     `````     ``        ````      ````      ```      ````     `````     `````     \r\n" + 
													"`````     `` ``     ````     `````     .+hddhhhhhhhhhdhhhhyyhhyhhhdhhhdddhhhhhddhdhhhhhyso+/::-:::::::::::////+ooy+.``````     `````     `````     ````      ````     `````     ````     `````     `````\r\n" + 
													"`````     `````     ````      ````     ``/yddhhhhhhdhhdhhhhhhhhhhhhhhhhhhhhhhyysssossssyyyyyso+:-:---::::::////ossy+:-.```     `````     `````    `````     `````     ````      `````     ````     `````\r\n" + 
													" ``     ``  `   ```      ````      ```` ``.+hddhhhhhdhhhhhhhhhhhhhhhhyysso+++++/+++oo+osyyyyyhy+--------:::::::/sssy+/:.``` ```     ````        ``     `` ``     ``        ````     `         `` ``     \r\n" + 
													"     `````     `````     ````     `````    `./shhhhyhhdhhhhyyyyyssoo+//::::::::::::::/+syyhhhhho----::--:::::::/+soyo//:-``````     ````      ````     `````     `````     `````    `````     `````     \r\n" + 
													"     `````     `````     ````     `````     ```./shhhyhddhhysssso++//:---------:////++oyyhhhhhds:::--:::::::::/:/ssys////-`` ``     ````      ```      `````      ```      ````       ```     `` ``     \r\n" + 
													"`````     `````     ````     `````     `````   `-oyyyssyddhhhys++//::------://+oooosyhhhhhysshhs::::---:::::::::/ssys/////.    `````     `````    `````     `````     `````     ````     `````     `````\r\n" + 
													"`````     `````     ````      ````     ````   `/syyssssyyhddhyhs+//++++++oosyyhhhhyyyyyyyys+ohhs/--:::::::::::://syys/////:`   `````     `````    `````     `````     `````     ````     `````     `````\r\n" + 
													"     ````      `````     ````     ``````  ` `:oyyyyyyyyyyyhhhhhhysssyhhhhhhhhhhhhs/:ssyyyyyhhhhhysoo+///////////+ysyo//////:```     ````      ```      `````       ``      ````       ```     `` ``     \r\n" + 
													"     `````     ````      ````     `````      +yyhyhhhyhyhhhhydmdhyhddhhssyyhhhhhyys+sssyyyhyyssyyssyyyyso+/:////ssss+///////.``     ````      ````     `````     ````      ````     `````     `````     \r\n" + 
													"     `````     ````      ````     ````     ``.shhhhhhhhyhyyyyyhhdddyyyh+-oyhhhhyyysyyhyysoooossssyyssyyhhdo/::/ssss+////////-``     ````      ````     `````      ````     ````     `````     `````     \r\n" + 
													"`````     `````     ````     `````     `````  :yddhdhhhhyyyss:/yyhhddhyssyhyhhhhyyyo+////+++ooossssshhhs+/::/+osys+:////////-` `````     `````    `````      ````     ````      ````     `````     `````\r\n" + 
													"`````     `````     ````     `````     `````   :yhddo-yhhyyysooyyyyyyhddhyoosyo+:::::/::::://++osyhhdy/---/ossyyo///:///////:` `````     `````    `````     `````     `````     ````     `````     `````\r\n" + 
													"      ````    `````      ````      ``````    ```:yddhhhhhyyyyyyyyyyyyso++osyysooso+++///:/+ossyhhhdddhyoosssyso::///////////:`      ```       ````      ````     ````       ```     `````     `````     \r\n" + 
													"     `````    `````      ````     `````     ````-ydddhhhhyysssooo+++++////::::/oosoo++++ooossssssssoooossys+:--::::/:/:://///``     ````      ````      ````      ````     `````     ````      ````     \r\n" + 
													"     `````    ````        ```      ````  ` ```-+yyyyyysyssssssoo++++//////:://+osyhyyyso+++++++ooossyyhhdys++++/::--:::::/://.`     `````     ```       ```       ````     ````      ```        ```     \r\n" + 
													"`````     ````      ````     `````     ``````/syyyyyyysssssssoo++//++++oosyhhddddddhyyyo:-::::/+osyysssyyhhhsoooso++/::://:::``````      ````     `````     `````      ````     ````     `````     `````\r\n" + 
													"`````     ````      ```      `````     ````-oyyyyyysssysssssooo+oosyhhhdhddddddhhyyoo++:..-:--::::/+oooooshdy+::/++oso/:::/::. ````      ````     `````     `````     `````     `````    `````     `````\r\n" + 
													"     `````    `````      ````      ````   :yyyyyyhhhhhhyyyyyysosyyyhhddhhhhdhhyyyyoo++:...--:::--:////+oossyhyo/::/+oso/:::/::.     ````      ````      ````      ````      ````    `````     `````     \r\n" + 
													"     `````    `````     `````     `````   -+ossoo++sddddhhyyo::/+ooossyyhyyhddhys++o+/......--::::://///+osyhhhy+/:/yoy/:::::/:.    ````      ````     `````      ````     `````     ````     `````     \r\n" + 
													"                         ````      ````   ```````` +hddhyys+:-----:/++++osyhhhdyo++o/-........--:::///::/++ossyyhs/oyyy/::::::::.   ```       ````       ``   ````````     ````                 ` ``    \r\n" + 
													"`````     `````     ````     `````     ``````    ``yhhyoss+:--.---..:///+++shhdyooo+-...........-::://::://+osssyhhhyy+::::::::::.``     ````     ````````````````   ``````     ````     `````     `````\r\n" + 
													"`````     `````     `````     ````     `````    `.:hhdooo+::-----------/+++oshhhsso:.............-:::///://+oosyhhhhh+::::::::::/:-.     `````    ````````````````    ````      ````     `````     `````\r\n" + 
													"     `````     ````      ````     `````     ```-/oyhhhss++//::::---------:+oshhyyo:---.............-::///++osyhhhhyyys/::::::::::::-````      `````  ````````````````      ````     `````     `````     \r\n" + 
													"     `````     ````      ````     `````     .:+oooyhhhs/////////::::--------/ohyho...........``.....-:/+syyhhysssssoosy+::::/::::::-````      ````````````````````````     `````     ````     `````     \r\n" + 
													"     ````      ` ```     ````     ``````  `:oo+/:.yhhso++++//////-:///::------shhy:......-...```.--/+syyhysooo++++oso+shs/:::::::::-```     `````````````````````````       ```       ```     `` ``     \r\n" + 
													"`````     `````     ````      ````      `.+ys+:` -hysooooooooooo/-:///////---./hyho.....`.----:/osyyyso+////+++++//+oooshy/::::::::-     `````````````..````...```    `````     ````     `````     `````\r\n" + 
													"`````     `````     ````      ````     ``/yyo-`  /hyooooooooooos+-:+++/////::--ohyy/....-:+osssyso/:-...-://++++/:..:/++ohy+:--::::.    ````````````............``    `````     ````     `````     `````\r\n" + 
													"     ````      `````     ````     `````  +hs+.`` sdsoooooooooooo+-:+oo+//::::::/hyyyoooosso+//:--.```.....-/+++o+:.``./o+ohho---:::.``````````````........--....``````     ````       ```     `` ``     \r\n" + 
													"     `````     `````     ````     `````  -sys+-..hdsoo+ooo+++++++::++oooooossyyyyyyhyo+/:-..``.--..``......:+++oo+/-.-:oo+oyh+.`.-.`.````````````.......-----...``````     ````     `````     `````     \r\n" + 
													"```        ``          ```     ` ````   ``.+ssyssddhyyyyysssossssssyyyyyyyyysso/+ydhy:.....```..--.```..-..-/+++o+oo+++ooo++sho-..```````````.``........-------..```  ``         ``          ```  ` `   \r\n" + 
													"`````     `````     `````     ````     `````.-/ohddhddhhyyyysssooo++o++/+++++//:-/yos+.-...```..---.```.--..-/++oooooo/-:+oo+shy:.````````.................-----.`    ````      ````     `````     `````\r\n" + 
													"`````     `````     ````     `````     `````   `sdhsyyossoooo+++++/:+++++++++++//:osos----.````..---.```--..-:/++ooooo+:.-ooo+ohh/..````...................-----.`   ``````     ````     `````     `````\r\n" + 
													"      ````     ````     `````      `````   `````shsoss/oooo++ooooo+/+++++++++++//:+yoo+.--...``..---.```.-...-/++++oooo+/-:oo++shh+.....................-------....```     ````      ````     `````     \r\n" + 
													"     `````     ````      ````     `````     ```.yyoos+:oo+++++++o++//+++++////////:os+o-.---..`...--..``.....-//+oooooooo/.:so++ohho....................-------......`     ````     `````      ````     \r\n" + 
													"   ```  `     ```         ``       ``         `.ys+os/:oo+:+/-++++++///://++//////:/soo+.----..`..---.``..--.-://+o++++ooo/./so+++hd+-...................-------......``  ````     ```          `  `    \r\n" + 
													"`````     `````     ````     `````     ````    :ys+os:-+++::/.:+++/+//////////////::+yoo-.----....--..```.-.--://+++//++o+++-+so+/+hho.....................-----.....``````     ````     `````     `````\r\n" + 
													"`````     `````     `````     ````     ````    +ho+os::o+:+-:-.////://///++////:::::/ssso---:--.......``.....-://///////+++o/:ooo+:+hy+:...................-----......````     `````     `````     `````\r\n" + 
													"     `````     `````     ````      ````     ```odo+os/:++--:.-.-:/:.-///////:::::::::+yss/.-::-..`.-.```.....:::///////++/+oo//soo//+hyo/::---.-......................`    ````     `````     `````     \r\n" + 
													"     `````     ````      ````     `````     ```sdo+os+:++/---...-/-`.//////:::::::::-/ssso---:-......``...`.-:::://///+/+++o+o/+s+++++hhooo+o++/:-....................`    ````      ````     `````     \r\n" + 
													"   ``  `  `  `` `   ``    `` `          `` ` `.yh++sso:+/::-.````--`.::/::::::::::::::+yss/---..`.-.```..`.--::::::////+/+++ooo/ss+/--+hyo--:/+o+oo:..................``     `  `  ````   `     ``  `   \r\n" + 
													"`````     `````     ````     `````     `````  .yh//oso//+/-..```````.::::::::::::::::-:syso---.....```..`.-::-.-::::::////++++o+oso+-`-ody/.....:oooo-.................```      `````    `````     `````\r\n" + 
													"````      ````      `````     ````     ````   .yh:/oss/+++/-..``````.::::::::::-::::---/yos/..`...``````.-::::::::::://///////+++ss+:`.-sds:..```./yoo...``............```      ````      ````     `````\r\n" + 
													"     `````     ````      ````      ````     ``:ys-:+os+/++//:..```...::::::::------::--:osoo.`....`````.-----::--::::/:/::::///+/os+/-../sdo-.....-shy-...............`    ````     `````      ````     \r\n" + 
													"     `````     ````     `````     `````     ``:hs--/os+/++///:-.``...:-::::--------:::::/yoo/`...`````.-:---:::-::-:::::-::-://///oo+-.`-/yh+....`-yyy-`..............`    `````     ````     `````     \r\n" + 
													"```   ` `  ``    ```  ````     ```     ``  `` :ys-.+oso::++++//:-....-----------:---:::--oyos-...````.------::-----::::--:-.:/-:/:+o+:.`.-ods/`...+dho`....`....```````       `` `     `    ` ``  `     \r\n" + 
													"`````     `````     ````      ````     `````  :hs:./oss::/+++++//:---.........---------..:soso.`````.---------------:::-.:.-:--//:/+//.`../yho-`.+hhs...````...````````````     ````      ````     `````\r\n" + 
													"`````     `````     ````      ````     `````  :ys:.:+ss+-/+/+/+////::--...........-......-+yos:````..-----------------:.`.`.-.://::+//.`..-ohy+:yhho...`````..`````````````     ````     `````     `````\r\n" + 
													"     `````     `````     ````     `````     ``:ys/:++sss//+++/++///::::---.........``.---.-ssso.``..----------:--:-..--.`` ``-:/:-:+//..``.+hhyydy:`````....``````````     ````     `````     `````     \r\n" + 
													"     `````     `````    `````     `````      `:yyooo+oss+-//++++////:::-------............./yss/`...----------::--:-...``   `.--:/:+/+-...:syyhy+.``````...``  ```````     ````     `````     `````     \r\n" + 
													"``         ``         ``     `````     ``` ```:yyso/:+oo+--//////////:::::-----..-....``.``.oyss-.-------------:-:::-.` ```  `./++://+:/osyhddh-``````````````````````  `        ``         ```     `   \r\n" + 
													"````      ````      ````     `````     `````./+shs:--/+oo/-////////////::::-------..`..`````/ysy+.--------------::::-.`  `` `./////+osyyysooydy.````..````````````   `````      ````      ````     `````\r\n" + 
													"`````     `````     ````      ````     ```-/+ooshs-.--+ooo////+////////:::---.......````````-syys/.-----------:::::---.`````-:/+ososyso/:../ydo``````.```````````    `````      ````      ````     `````\r\n" + 
													"     `````     ````     `````     ````` `:+oo/:+hy/-.-:+so+//:+////////::----........``````../hyys--------:----::::---....:+ossssso+++-.``.+yd+`.````````````    `````     ````      ````     `````     \r\n" + 
													"     `````     ````      ````     `````.+o++:--/yho----/ooo+/://///////:::---...-....````....-ohyy+.------::-------::::/+ssssoo+/://++..``.ohh/``````````````    ````      ````     `````     `````     \r\n" + 
													"   ``  ``    ```          ``    `    ``:oo+-...-ohy/----/+oo//:+//////:::::--..--....````...../yyys-.----------::/+ooossyyo++//////+++.`.`:ohh.```````````` `````        ``  `     ```          ``   ```\r\n" + 
													"`````     `````     ````     `````   ``+os/...../yyo:---:/+oo//+/////::/:::-------..````......-ohyh+.----::/+oosyyyso+////////++++:/++``.-osho``````````    `````     ````      ````     `````     `````\r\n" + 
													"` ```     `` ``     ```       ` ``  ```:sy+-....-oys/:---:/oo+///////:///:--------.`````...``../yyhy+/++oossssso+:---:://////+++++-/o/```-ohh:``````````    `````     `````     ````     `````     `````\r\n" + 
													"     `````     ````      ````     `````./sso/----:yyo/----:++o+::////:///:--------.``````....-:+yhhhyssssoo+:---.--:///////+++/++:-+o-``.:ody```````` ```````   `````      ````     `````     `````     \r\n" + 
													"     `````     ````      ````     `.``...:ossso+/:ohyo/--:-::/+/:-::::::::-----.--.---://+ossyyyyhhhyo/::-------:::://///+++++/++::o+..`./yd/```````` ```````  ``````      ````     `````     `````     \r\n" + 
													"` ```     `` ``     ```       `  `````....-:/ossssyhhhyoo++++/+++//////++++++++oosssssssssso+//::oysyo-.----:::://::://///++++++/-/+/```-+hy-`````````````  `````     `````     ````     ``` `     `````\r\n" + 
													"`````     `````     ````     ````````........--::+oosyhhyyyyyyyyyyyyssyyyysssssoo+//:-.....```...:ssyy/---::::://////////+//++++/-++. ``/yho.``  ```````    ``````    `````     ````     `````     `````\r\n" + 
													"`````     ````      ````     ``````..............----/yhs+//++++++ooo+/////::--....``````...``..--+ysyo:::::///////////////////+::+/`` -ohh:`````````````  ```````    ````      ````      ````     `````\r\n" + 
													"     `````     ````      ````     `.............------:oys/::::::/+o+/::::::::-..-..``````....`..-:yhyy+::://////////////////++/:/+-``.+yhs````````   ```````    ````      ````     `````     `````     \r\n" + 
													"     `````     `````     ````     `............-.....---+sy+/::::/++o++::-:::::--....``````........+hhhs/:/:::///////////://///:/+/```:ohd:````````  ````````    `````     ````      ````     `````     \r\n" + 
													"```` `    ````        `       ``  ``...............------:shy/:::://+oo+/--:::::--......````.--..``-shhy+:::://:::::::///:////+/++.``./yds````  ````````````````      ````     ````           `      ```\r\n" + 
													"`````     ````      ````     ````````.............-------.-+syo/::::/++o+/:--:::::---.........---.../hhhs/:::////::::://:////++/+:```:shh-`.``   ````````  ``````     `````     `````    `````     `````\r\n" + 
													"````      ````      `````    `````` ``............------.---:ohy+::////++++:--:::--::-.........---...ohsy+-:::::::::::::::///////.``-oyd:`````  `````````   `````     ```       ````      ````     `````\r\n" + 
													"     ````     ``````    `````     ````..``..........--::------/yhy+/////++++/::--::::::-............./ssys/-------::::::::://///.` .+ydo`  ` ``````     ````      ````     `````     ````      ````     \r\n" + 
													"     ````     ``````    `````     ``````...........---::----::-:ohhs+////+++++/::---::::----.....``...oysy+.-..----::::::::////:..-+shh:-.`  `````      ````      ````     `````     ````      ````     \r\n" + 
													"````      ````       ```      ```      `...........---:::-:::::::/shyo+/////++++//::-----------.......:ssss:......-------::://////osyhysyss.``  ```````     `````     ```       ```        ```     `````\r\n" + 
													"`````     ````      ````     `````     `..........----::---:://:/::+yhho+/////+++++//:--..-----------..+yss+-.........---:::////++++osyyhhhy.     `````     `````     `````     ````      `````    `````\r\n" + 
													"````      ````      ```       ````     ``.........---::::-:::///::///+shyo+/////++oo+//:--------------.:sysy:..........---:::///+osyyyyyhhdh.     `````     ````      ````      ````      `````    `````\r\n" + 
													"     `````     `````    `````     `````  `....--...--:::::::::::://///:+shds+//////++////::------------./syy+.````..--::::://+ssssssyhhdddh:  ````     `````     ````      `````     ````     `````     \r\n" + 
													"     ````      `````    `````     `````   `.----------::::::::::::////:://ohdyo+/:////////::::::---------shyy/--://////++oo+//:/shdddmdhhh:  `````     `````     `````     ````      ````     `````     \r\n" + 
													"`````     `````     `````     ````     `````..------------:::::::::::////////shhyo+////////::://::---::::+ssso++++++oo++///+shdddmmmddhdy: ```    `````     `````     ````      ````      ````     `````\r\n" + 
													"`````     `````     `````    `````     ``````....---------::::::::::://////////+yddhyo/////////:://////+++sysssssooosssyhhdddddddddddddo.````     `````     `````     ````      ````     `````     `````\r\n" + 
													"` ```     `` ``     ```       ````     ````......----------::::::::::::////:::/osysoo+++++++///++++oooossssssssssyyyhhhhhdddddddmdddddm+ ````     ``` `      ````     `````     ````      `` `     `````\r\n" + 
													"     `````     ````      ````     `````  ``..-.....------------::::::::--::-:ohyyyssyysssssssooo+////++osyhhhyhhhhhhhhhhhhhddddmddhdmmmh.     ````     `````      ```      ````     `````     `````     \r\n" + 
													"     `````     ````      ````     ````` ```.........-----------:::::::-::::::ohhhhhhhysssssssosssssyyyyhhhhhhhhhhhhhhhhhddddhhyyyyyhmhsds`    ````     `````      ````     ````     `````     `````     \r\n" + 
													"` ```     `` ``     ```       ````     ```..``.....---.--------:----:::::--::+yhhhhhdhhdddhhhhhyyyyyhhhhhhhhhhhhhdhhdhhhyhhdhydsosyyhdyhd/......`` ````      ````     `````     ````      `` `     `````\r\n" + 
													"`````     `````     `````    `````     ``...```...---....----------:::::::---::+yyyhhhhddddddhhhhhhhhdddhddddddddddyyysysdssssyhoossyhdhhhyyysyso+-````     `````     `````     ````     `````     `````\r\n" + 
													"   ``  `  `  ``     `````     ```      ````````..........----------:::::::------:/+syyhdddddddddddddddddddhhydhhhhdysyyysyhssshhyoosyyhhhyyysyyyyyso/.``   `````    ``````      ````      ````     `````\r\n" + 
													"     `````     ````     `````     `````   ```..........-----------::------------..--:+shhhhddddddddddddhhhhyydysyyydssssssyyossooosooosossyssyhhhhshho:`````     `````     ````      ````     `````     \r\n" + 
													"     ````      ````     `````     `````    ```...```...---....----::---.-------------:/ydhdhhdddmdhhhhhhyhyyyhhsyhhhyysssssdyooo+++++ooooossyhhhhdohhsyo-```     ````      `````     ````     `````     \r\n" + 
													"`````     `````     ````      ``        `````````...........----...-------------------:ohhhhhdddddhhhhdysyyyyydysyssssssssooo++++++o++++osyyhhhhhdshdsshs:  ````      ````      ````      ````     `````\r\n" + 
													"````      ````      ````     `````     `````    `````````...---....--------------------/yhhdhhddddhhhhyssyssyyhhysssso+++++++ooo+++//ooosssyysyhydshdysyyo- `````     ````      ````      ````     `````\r\n" + 
													"``       ` ``          `      ````     ````         ``````....-..--------------:-------:sdddhhhhdddhdhhyyysssssoo+o+o+ooooo+++//+oos++osyysosysyydsydhsyyy/` `                   ``         ```     ````\r\n" + 
													"     `````     ````     `````     ````      `````    ````````...---------------...--:/+oshhhhhhhhhyysssoooooooooooooo++++/++////ss/osyooosyyyyssydssyhyys/.`      ````     `````     ````     `````     \r\n" + 
													"     `````     ````     `````     `````     `````     `````````...----.-----------:+osssssssssssssssssssssssooo+++++/++//+yo:::/d+:/+osyyssosyhhhdsyss+:.```      ````     ````     `````     `````     \r\n" + 
													"`````     `````     ````      ````     ````      ````     ```..``.....----------:/ssyysyyyyyyyyyyyysyyssssooo++++/++/////oh/-:-od/:soooooyyyssyyyso+:.`      ````    `````      ````      ````     `````\r\n" + 
													"`````     `````     ````     `````     ````      `````     ``````````..-.....--:/syyysyyyyyyyyyyhysyhhysoo++sys+//:oo++:/ds::::yh::osso+osossoso/-.````     `````     `````     ````      ````     `````\r\n" + 
													"``       `  `     `    ```    ````     ````        `        ```   ``````` ```..:ohyhdyyhhhhhhyhdhsshyssys+/++osys/:osso/sd/:::/ho:://++oooo+/:.```` ``` ``  ``                `` `     `    ` ``     ```\r\n" + 
													"     `````     ````      ````     `````     `````     ````     `````     `````.-sdhyhhyyhhyyyyhdyshhsooosyo+////oys+//:+dy::/:/h+:://++/:-.`` ````     `````     ````      ````      ````     `````     \r\n" + 
													"     `````     ````      ````      ````     `````     ````     `````     ```` `:sydhyhdhyhhyyhdyyhhyysooooyy+//::/oyys+yd+/////o/::--..`      ````     `````      ```      ````     `````     `````     \r\n" + 
													"`````     ````      `````     ````      ```      ````      ````      ```      `/yyyddyyhhyyyhhyyhhyyhyssooosyyo+++++oyyhs+///:-..```      ```      ````     `````     ````      ````      ````     `````\r\n" + 
													"`````     `````     ````     `````     `````     `````     ````      ````     `-sysydhyyhhhdhyyhdhyyyyyysssssyysoooo+//:-..``  `````     `````    `````     `````     `````     ````     `````     `````\r\n" + 
													"`  ``  `  `  ````    `    `` ``       ``      ````  ````       ``     ` ` ``  `.+yysyhhyyhdhyyhhhyyyyyyyysso+//:--.```````   ```` `` ` `````  ``         ``        ``   ```` `  `  ````   `     `` ``   \r\n" + 
													"     `````     ````      ````     `````     `````     `````    `````     `````  .:/++oo++++++++++//:----..````  `````     `````     `````     ```      `````      ```      ````     `````     `````     \r\n" + 
													"     `````     ````      ````      ````     `````     `````    `````     `````    ``````  `  ````     `````     `````     `````     ````      ````     `````      ````     ````     `````     `````     \r\n" + 
													"`````     `````     `````     ````     ````      `````      ```      ````     `````     `````     `````     ````     `````     `````     `````    `````     `````     ````      ````     `````     `````\r\n" + 
													"`````     `````     `````    `````     `````     `````     ````     `````     `````     ````      ````     `````     `````     `````     `````    `````     `````    `````      ````     `````     `````\r\n" + 
													"   ``  ``    ``     `     ``          `   `    ```   ```   `   ``       ` ``          ```     `  ``    ``         ``    ``   ```     `  ```   `          ``         ``   ``  `     ```          `  ` ```\r\n" + 
													"     `````     ````      ````      ````     `````     ````     `````     ````      `````     ````     `````      ````     `````     `````     ````     `````     ````      ````     `````      ````     \r\n" + 
													"     `````     `````    `````     `````     ````      ````     `````     `````     ````     `````     `````      ````     `````     ````      ````     `````     ````      ````      ````     `````     \r\n" + 
													"");
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											System.out.println("Game: You have picked up the mysterious item.");
											System.out.println("Game: It seems to be a small mirror.");
											System.out.println("Game: The mirror begins to glow, the glow begin to blind you.");
											System.out.println("Game: When you opened your eyes, you find yourself in a dark citadel.");
											System.out.println("Game: You hear a strange noise in the background.");
											System.out.println("......");
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											
											System.out.println("                             ``````                                                                                                                              \r\n" + 
													"                                                `                ` `````` ``                                                                                                                            \r\n" + 
													"                                                               ````````        `                                                                                                                        \r\n" + 
													"                                             `                 ````````  `    ```                                                                                                                       \r\n" + 
													"                                       ````````  ```    ``````   ````       `````                                                                                                                       \r\n" + 
													"                                       ```      ```.--://+++//::-.`` ``      ````                                                                                                                       \r\n" + 
													"                                         ``  `.-:/+++++++++++++++o+/-`       ````                                                                                                                       \r\n" + 
													"                                       `` `.-/++ooo++ooooosssssssssso-`      ````                                                                                                                       \r\n" + 
													"                ````````       `       ```.://///ossyyyyyyyyyso+::-.``````    ``                                                                                                                        \r\n" + 
													"                ````      `    `       ```-/+///oyyyyyyyyo+:-.```` `                                                                                                                                    \r\n" + 
													"                         ``````      `  `.++///oyyyyyys/-````   `                                                                                                                                       \r\n" + 
													"               `        ```  `  ``   ```-+++++syyyyyy+.`    ``` ``                                                                                                                                      \r\n" + 
													"               ` ```  ` ```` ` ``    `.:+ooo+syhhyyy+.   ``   ` `                                                                                                                                       \r\n" + 
													"               `     ` ``` `   ` ```.:+oooooyhhyso/.```` ` `  ` `                                                                                                                                       \r\n" + 
													"                ```   ` `.``````.://+osoossyyy+:.``` ``  `  ````                                                                                                                                        \r\n" + 
													"                  ` `  `.-o+///oosssoossyyyo:.` `` ``` `````  `   `                                                                                                                                     \r\n" + 
													"`````            `  ` `-:-ssssssssosyyhhyo:` `` `` ``` ``      ```` ```````     `                                                                                                                       \r\n" + 
													"``` `          ```  ``./::sssysssyyhhhhs:.``` ```              `     `.-.`  ``` `                                                                                                                       \r\n" + 
													"````````````````  ````////osyyyhhhhhdho. ``` `-`               ``` ``:+/`  ``` ``                                                                                                                       \r\n" + 
													"  ` ```````` ``` ```.:/+++ossyyhhhhdhy-   ```./.               `````:s+.    ``  `                                                                                                                       \r\n" + 
													"    `````  ` ``.-/++osssysoyyyhhddhyo:```  ``:/:                 ``:yy/.``````  `                                                                                                                       \r\n" + 
													"    ```` ` `./++ooooosssssoyhhhhhs:.``` `` `:o//               `` `/hho:``   ```                                                                                                                        \r\n" + 
													"   ```````-/+soos+oosooosssshhy+-``` `````:os+o:               ````/yhyo:.`  `                                                                                                                          \r\n" + 
													"  `````` .oooo++ssssossyhhsys+-` ````` `.+hy+o+`               ````.ohhyo/.````                                                                                                                         \r\n" + 
													"``````` `+ooshyysooyyyhdmyso-` `  `` `./yhs+++.  ` `         `   ```-ohdyo+.````                               ````         ``                                                                          \r\n" + 
													"`   ````/yyyyhhdmhydddhddhy:`` `` ````+yhy//:` ````           ``` ` `.+hhoo/.` `                               ````                                                                                     \r\n" + 
													" ` ``.-+osyyhhddmddhdhhhys+.`` `` ` `:yyhs:-``` ````        ``` ``   `.oyoo+:.`                                                                                                                         \r\n" + 
													"   -//+yoyoyhhhmmhsoshh+.`` ` ``` ` .oyshs:.`````````      ``````  ```-+ssyo:.`                                      `````                                                                              \r\n" + 
													"  `+/-+syyoydddhy/-`:y/.``    ``` ` .yyssso:.`` ``  ``` `` ````` ``.-+ossyy+:.``                                     `````     `                                                                        \r\n" + 
													"` `/ysyhhsodmmdhs. `.-``   ````   ` .yyo+oss+/:.````    ```````.-/+osyyhhhyo:``                                        ``  ..`                                                                          \r\n" + 
													" ```:+shysyhdddy/` ``` ```` `  ``  ``ohso+++oooo++/:.```` ``.:/+oosyhhhhhys/.```                                `         .+:```                                                                        \r\n" + 
													"  ``  /dsoyyddyh+` ```` ```       ```-yhyo++++oossooo+:. `-/ooossssyyyhhyo/.` ```                                ``    ` `oy:```  `   `       `` `    ````                                              \r\n" + 
													"`   ``+dsssyddhdh` ` ``        `  ````:yhyso++++oossooo+:/oooosssosyyhhy/-`` ```                ``             ```` ````.+y+`````      `  ````:. ` ```````                                              \r\n" + 
													"  ` ``oyyyyyhdddy. `    `````  ```` ```:yhhysoso++oooo++oo++sssossyhhhs+--` ` ``                              ` ``` ``./syo.``````      `  ``/o.  ` ``````                                              \r\n" + 
													" ``  .hyyshhhhmmh:```  `````     ``   `-syhhhyysso+++o+++++ooooyyhhhyys/.` ``  `                              ``````./shdh/`  `````    `  ` -ys.   ````````                                             \r\n" + 
													"   ``-hsssshhydmdo.`` ` ````    ```    `.oyysssyyss++o++oooosyyyyyyys+:.` ````                  `````     ``    `.:oyhdmd/`    ```````` `  `ohs-   ``````````                                           \r\n" + 
													"  ```:ysyyshddddds/- ````````  `````  ```.+syyssoossoooossoosyyyyhhyo.```   `` `               `    `      ``  `:syydmms:`  `````````   `  -hdh/`` ` ````   `  `                                        \r\n" + 
													"`` ``/hyhoyymddhdhs+`````     ```    ``.:...:ydhssooossssssssssssss+-````...````               ``````   `  ` ``/yyyhmd+.````  ``  `   `` ``:hmdh+.   ``````    `                                        \r\n" + 
													"``` .sysooshdmdhddhh/-.```  ``      ````-+sooshdhysssyhsyyyysooshddy++oyyo:.` ``               `````` ` ``  ``/sosyhms. ` ```````````` ``` .ymddh+.` ``````    `                                        \r\n" + 
													"`` `-yyysyhhhdddhyo+++///:...``````   ````-+hhhhyy+/shhssyys//sdddddddhs/. ``         ``       `````` ```    -oo+ossy+```.:/+++///:.``` `   :hmddds-`  ````    `                                        \r\n" + 
													" `` `+mhyyhhdhhhyso+///+++o+os+/::-.````````-+hhyosssssoossosyyhyhdyo:.``` ``` ``                      `` ```/so+++o+:../sso+//++ooso:````  `+ddddds. `` ````                                           \r\n" + 
													"``  `:Ndhhhyyhddhysoo+++++oooss++++o++oo/-.```:hhyssssosssssyyhyyo:.` ` ````    `   ``   ``     `        ``` :sso+///++//oo+/--:/++oss/`  `` :yyhddh/````````                                           \r\n" + 
													" ``` .dhdhdmddddmdhyssoooooooss+//+oosyyssoossyhhssooo+o+ooooosyoo:`````````             `````  `     `` ``  .ohyo///:/+++//++//++oosyo-`  ``:oyhddd+````````                                           \r\n" + 
													"   ` :mdhdmmmddddmmdhhyysssossso+++ooosyhyydhyyhdhs+//---:--/+soydh+-`                ```````` ````   ```  ```-ohhys+/////++osoossossso+///+ossyhddh:`  ````` `                                         \r\n" + 
													"`    .-:--:/osyhhhddddddhhhyyyysosooooshdhhdhddddhyo/:------:+osdmddh+-``  ```        `  ````  `````  ` ```  ``:ohddhyssoooshhyosso+///+++++osyhhdh/``  `````                                           \r\n" + 
													"`        `````.:oyhhhddhhddddddhysssssyhddhdhdmmddhyo+/::///oosdmmmdddh+.`  `  `     ```  `` `` ``` ``````  ````-shhddmdddddmdyyys++///++osyhhdmmy/.` ````````                                          \r\n" + 
													"  ````    ```   `.-:/shhddddmNmmdhsoooosshhhddddhdddhssososssydmmmmmdddh+-```        ```` `--```` ``..``` `..--+shhhhhdmmmmmddyhdhyyyyyhhddmmmds:.````  ````   `                                        \r\n" + 
													"```````  ```   `` ```.:oydmdmmNmdds+++++ssyyhhddhhhhddhhdhhhhdmmmNNmmmddhs+:.```     `` ` `.:+/-.```/o/-/osssossyyhhhyyhyhddhhyydmmmmmmmhyo+/:.`` ``````````                                            \r\n" + 
													"`  ``    ```  ``` ``````.-+shdNNmdho/+ooosssyyhhdhhhhdddddmmmmmmmmmmdhhhhhyso/-````` ````  ``/sss+osssssyso++oosyhdmdhssssyyooyyyhdmmmmdhs/-``    ``    ```````                                         \r\n" + 
													"               `````    `` ``-dmmmdy+++ooosssyyyhhhhyyyhhhddmmddddddhhyyhdhys+++/-```````.---/oyhhyhyyhhhysoosyyhddddhysyyyo:/ysoshhdmdy/.````                                                          \r\n" + 
													"               ````     ``` `.dmmmmhs++ooosssyyyyhhysyysssyyhhhhhhhhyysssssyysooss+-.-+oossyyyyyhhyhdhyhdhyyyhhddmdhdhyssysooyhhyysso//:-.``````                                                        \r\n" + 
													"               ````     `  ``.dmmmmdhsooossssyyyyhyosso+oossssyyyyyyso+//+oosyysssss/:+++oossyyhhyshhhhyhhhddddhddhhdhyo+osoyyyyhyyhdhys/..````````````                                                 \r\n" + 
													"                `` `     ``` .ddmmmmhysooosssyyyhdyoyysoooooooooosssoo++++++ossyyyyhs/-/+osssyyyysyhhhyyysyhhhyhdhhhdhy+:::////syyhhhyo:..```````````  ``````` ``                                       \r\n" + 
													"                   `   ``  ``.ydmmmdhyyyssssssyyhhysysoooooooooo+ossssooooooossyyyhhho:://+++ossyyyssyyyyysssyhhhhhhdhyso+////+osyyyyss+/:--..```````````````````                                       \r\n" + 
													"                       `` `` `ommmmddhhhyyssssyyhhyyyooooooooooo++osssssooossssyyyhhhs/-:/+///+osyhyysyssyyyyssyyyhhhhyyssssssssyyyyysssooooo/-.`````````````````                                       \r\n" + 
													"                        ` `` `-dmmddddhhhyyssyyhhyoyyyysssooooooooosyyyyyyyyyyyyyyyyyyso/+ssoo+osyyhhyyssoosssyyyyyyyhddhhyhhhhyyyyyyyysssoo/-.``````````````````                                       \r\n" + 
													"                ````````````` `ommdhhhhhddhyyyhddyssssssoooosssoossyyhdddddddhyysso+ossyyssyyso+oooyhyssssssssssssssyyyhhhhddddhhhhhysyyyss+-```````````````````````                                    \r\n" + 
													"                `````````  ``  .ydhhhhyyyhyyyyhdyyyyssssssssssssyyyhddmmmNNNmdhysooo+osyyyyhdhyooso++oooooooooosssssysyhhhdddddhhhhysssyyyyo-.``````````````````````                                    \r\n" + 
													"                ````````` `` ```/ddhyyhysyysssyysyhhyyyyyyyyyhhhddddddmmmmmNNmmhyyysssyyssydmdddhyssoosyyyyyyyyyyssyyyhhhhhhhhhhdhyyssyyhhh+-```````````````````````                                    \r\n" + 
													"                ````````` ``  ``/dyhhyhysyyssso+osyyyyyyyyyyyyyyyhddmmmmmmNNNNmmdyssyyysoshddddmmdyssoosssyyhhhhhhyyyhhyyyhhhhhhddhyyyhhhhd+.```````````````````````                                    \r\n" + 
													"                ````````````````:mhhhyyhyyyyyso+oshhhhysyyyhhhyyhhdmmmmmmmmhyhdhhysssyysssyhddddmmhyhyoosssssyyyhddddhhyyyyhhhhhdhhhhhhhddy:``````````  `````````                                       \r\n" + 
													"                ````````````````:dhhhssyyyyyysoosyyyydhhhyhhhhhhdddddmmmmNh//sdhyyhdhhyyssshhhddmmdddhsosssssyyyyyyhdhhyyyyhhhdddddddddddy/.``````````````  `````                                       \r\n" + 
													"                ````````````````-yysssyyyssyysossyyyydhhysshyyyyhyshdmmmNdo/oddsoyhdmmdhyhhhddhhddhddhysyyyyyyyhhhhdddyyyhhhddmmmmdhyhhdy:.`  ```` ```--..``  ```                                       \r\n" + 
													"                ```````` ```````./ysssoo//sssssssyyhhyhy+/ss+oyo++oshddhhyyyhmmhssyhhdmmmmmmmmdhdmdddhddddhhhhhhhhddddhhhdddmmNmdhyyyyhhy:`  `` `` .//-..```  ```                                       \r\n" + 
													"               ```````````````..-:+oo+:/+++oossssyyyyyys++oooooooo+shhyssmmddmmmdhyyyhhdmmNNmmmNmddhddddddmmmmmddddddddyhmNNNNNmdhyyyyhhd+.  ```` -+-```````````                                        \r\n" + 
													"               ```````````````..-:/::/-.-:--+ssssyyyss+:-::---:+syyyysydmdmdmmddhhhsoshddmNNmmddhhhdddddddddddddddddmmhhmNmNNNmmdhyyyyhhd+.  `` `.s:` ``````   `                                        \r\n" + 
													"               ```````````````..:/+:---..``./ooosso+++:......-:/+oso+shdddhdddmdhhhyosddddddhysyhdddddddddddddddddmmmdydmddmNmmmddhhhhhddo.`    `/s.``  ````   `                                        \r\n" + 
													"               ```````````````..-/+/:::--..`.:+ooo/---...----:::////+++/:...-::+yhhhsydhhyyhddddddddhhhyyhhddhhhhdddhhdds--hNmmmmddddddddyo:.``` +y-``` ````   `                                        \r\n" + 
													"               ````````````````.-:/++/::--.....-::....--:::::::///+oo/+-````````+dhhhhddhhhhhddddddddddddmmddddddddddmds- .hmdmmmmmdddddddhyo:```:y+``````   ` `                                        \r\n" + 
													"               ````````````````..-:/++/::::----.-----::::::::///+ooo+:.`````````.sdhhddddhhhhddddddhhhhhdddddhhddddmmmd+.`.ymmmmdddddddhyyyyhy:```+y:`````  ``                                          \r\n" + 
													"               ````````````````..--:oo+//:::::::::::://///////++o++os+-.````` ```:ydhhdddddddddmmmdddddddmmdddhddmmmmmh+.  /dmmmdhhyyhhhyyyyyhs:```+y+. ``                                              \r\n" + 
													"               `````````````````..-/sso+////////:://///////+++ooosyyso/-````````:yhhddhdddddmmmmmmdddddddddddddmmmmmmmds:..+mmmmddhyyyyhhyyyyhhy/.``/yo-` ``` `                                         \r\n" + 
													"                ```````` ````````.:ossso++++//////++++++++oooooyyhhhhhho.``````-sddyydddddddmmmmNmmmddddmmmmdddmmmNNNmmNdyhdmNNNmmddhhyyyyyyhhhhho:``.ss/:/-`   ````   ``````                           \r\n" + 
													"                `````````` `````.:oyssysooooo++/++++++ooosssssyhhddddddy+.` ``.oddhhdddddddddddmmmddmmdddmmmmmmmNNNNNmmmNNmmNNmNNmmmmddhhhhhhhhhddy+-.-oyyyy:```````   ````````                         \r\n" + 
													"               ````````` `````..:sosyyyyssssssooooooossssyyyyhhhdddhdhhys:````+dddhhhhhyhmmmdmddmmmddddhhddmmmmmmNNmmNNNNMNmmmNNNNNNNmmmdddhhddhddhyssoydhddo.`            ````                         \r\n" + 
													"                ```````  ```./yyysooshhhhyssyysssossssssyyyyhhdddhhssyhys+.``:yhhhyyhhhhdmmmmmmdddddmdhdmmmNNddmNNNNNNNNNNmmmmmmmmmNNNNmmmdddddddddhyyhdmmddy/.`  ` ```    ````                         \r\n" + 
													"               ``  ````````.:soooshy+ohhhhhyyssssosyyyyyyhhhhddddsoooshdhs:-/hddmmddhhhdmmmmmmmmmmddddddhdmNmdhmNNmNNNNNNmmNNNNmmmmNNNNNNmmdhhdhddddhhdmmmhhyo/:.```````     ``                         \r\n" + 
													"                   `` ``.+so+++++oysyooydddyyyysosyhhhhdhdhhhdddhs+ooooosysooymNNNNNNNmmmmmmdmmNNNmddddddhydmmNNNNNNNNmmmmNNNNNNNNNNNNNNNNdhdddhyyhdmmmmmdyssshho:``  ``     ``                         \r\n" + 
													"               ``  ` ``/hhsso+//+syshdshddmdhhhyyyhhhhhddddhddddhso++syhhddho+ymmmmmmddddmmmddmNNNNmmddddddyyddmNNNNNmmmNNNNNNNNNNNNNNNNNNy/ohmdhyhdddmmmmddhhmmdo.``   ``    ``                        \r\n" + 
													"               ``  ` `/hyssso/+osyhdhdhyhdmmddhysshddhhddddddmmdho+oyo+ossssyssyddddhhhhdmmmmmmmNNNNmdddhhdhsydmmmmmNmmNNNNNNNmmmmNNNNNNNNNh:.odmdddssddmmhyhyhmd+.``   ```   ``                        \r\n" + 
													"`````````  `` ``````.+yyysooossyhddhyddhdmmmmmdhyyddddddmdddhdddyshyso++osoymmmdyyddddddmmmmmNNNmmNNNmddhhhdhssdNmdmNNNNNNNNNNNmmmmNNNNNNNNNd:`+hmddhydhhhddhyhdmh/` ``````                             \r\n" + 
													"````````` ``  ``  `:sso++oosyhdhhdmyyddhmddmmmmdhhdmmmmmmdysyhhyshyyyso+ooshdmdddyydddmmmmmmNNNNNNNNNNmddhyhdhosmNmmmNNNNNNNNNNmmmmmNNNNNNNNd/``.oddhhdhhhhhdmhhmdo.  ```     `                         \r\n" + 
													"``         ` `` `:sso++oosyddssyhdhyhmdyddmddmmmdhdmmmmNmdyooshyyhsssysooosyhdmdhyssdmmmmNNmNNNNNNNmNNNmddhhhdyohNNmmNNNNNNNNNmmmmmmNNNNNNNNmy++s/+hds+hdms-odddmdo-` ```     `                         \r\n" + 
													"    ` ```` ``  .+sso++oyhhhyyhdhosdhhmhsdmdhmmNNmmmmmNNmmmhsoossdhosssssysssshdmdhysymNmmmmmmmmNNNNNNNNNmdhydmd+smNmmNNNNNNNNNmmmmmNNNNNNNNMmhdmNh:..` `::.`sddmmdo-``     `                            \r\n" + 
													"    ` ``  `````/ys+/oyhyyyyhmhhhhohhmmhyymmmNNNNNmmmNmNNmmmhyosyhdyysooosyyyysosyyysyhdddddmmmmNNNNNNNNNmdhhddd++dNmmNNNNNNMNNmmmmmNNNNNNNNmmmNNNmo. ` `  `:dddmddo-       `                            \r\n" + 
													"   ` `  `` ` `.oyyyhhsssyhydhsshhyhdNmdmyhNNNNNNmmNNNNNNNmmhyhhydmhyydhyysooshhhdddhoohhdddmmmNNNNMMNNNNmdhhdmmo+dNmmmdmNNNNNNmmmmmNNNNNNmmmNNNmddho-``` `.yddmmdy+.  ``   `                            \r\n" + 
													"``` ` ``  ```-ooshhsooyyhdyyssyhmddmmdmNmddNNmdhmmNNmNNNNNmhmmdydmdhdhysoss+ooyddddmh++hdmmmmNNNNNMNNNNNmhhdmmd+ommmmmyo+ymNmmmmmmmNNNNNNmmNmmmmmNNNd+-``:ymmmmmhs:`` ``    ```                         \r\n" + 
													"`````` ``  `.osshyoosyyhhhsosyhdmmmdddNNNNmdho--ymmmmmNNNNmmNmmdmmdddhhyooho+osyhdddmyoymmmmmNNNNNmdmNNmdhhdmmy/yNNmmmddhyydmNNNNmmNMNNNmmmmmmNNNmdmNNd+ydddmmmds/`         ```                         \r\n" + 
													"```````` ``.oyhdsooooyhsoshssyhdddhdddNNmyo:.```.sdmmmmmmNNNNNNmmmmmdyysoyho+syyyhddhyhyshddmNNNNNo.+dmdddmmmh++dNNNNmmmmmddmNNNNNNNMNNmmmmmNNNdddhhhmNmmmmmmmmy+-`      `` ```                         \r\n" + 
													" ``````  `-yssdsosyyysysossysyyhdddhhhho:-`  `` ``/ymmmmmmNNNmNNmmmmdyooydyosyysyhhhhdmdydNNNNNNNdo+ydddmmNmho/hNNNNmmmmmmmmmmNmmNNNNNmmmmmNMmhhdmNNNNNmmmmmmmy/-`    ` ``   ``                         \r\n" + 
													"```````  `/hoohssshyssyhyhhhyydNNNms/:.``` ```  ` `./ymmmmmNNNNNNNmmddhhyyyyhsooshhhddmdhdNNmNmmmddddmmmmmdy++dNmmmNNmmmNNmmmmNmmNNmmmmmmmNMNmmddmNNNNNNNNmdy+:`` ``  ````                              \r\n" + 
													"  ````` `-osoosyyyyyyysoshhdddhmmms-`` `   ```    ` `./hmNNmmNNNNNNNNmdyssssyhssssshddmmmddmmmmmmdmmmmmmdy+:+dNNNNmmNmmNmNNNNNNNNNNmmmmmmNNNNNmmNNNNmmNmmdy+-.`      `` `                               \r\n" + 
													"  `  `` .ooyhdhhhhhhsooyyymmmmddho.``` `  `   `` ``  ``./smmmNNNNNNNNmhhdhhhhhhyyyhdddmNmhhmmmNNNmmmNNmyo:.`.:ohmNNmmddmNNNNNNNNNNNNmmmNNNNmNNmdmmNmmmmds/-``        ````                               \r\n" + 
													" ```   `+yhhhhhysso+oshdhhmmmdso-````   ````````````   ```-+ydmNNNNNNmdmhysssyhhhddddddmmhdmNNNNNNmmhy+-.`    `.:yNmmhdNNNNNmNNNNNNNmNNNNNmmNNNNNmNmNmh:.`` ` ``` ` `````                               \r\n" + 
													" `` ` `-hhhhyyhssoosyhhdmmmmds:```  ``` ``` `` ````     ``` `-/sdmmNNmmmhyysssyhdddmmdmmNdydNNNmmhyo:.`` ``   ```:ymNdoooyhdddddddddddhdmmmdmNNNNNNNNNy/``` ````                                        \r\n" + 
													"  ``  ``:dhssyhyyyyhhdmmmmmy/.`    ``````````          ```` ``./hdhhhdmmmdhhhsyhddhhdmmmmhooyyso+:-.``   `  ``````/dmms-```..---------ommmdmNNNNNNNNNNdy-`` ``  ```        ````                         \r\n" + 
													"` `  ```.hsooyddddddmmmNmdo.` `   ``` ````   ```````````   `.+hdddddddmmmmmdhyyhddyyhdmmmmyoo:..````    ``` ````` `:ydh+.` ``  `  `   /dNmmNNmmNNmNNNNNmh- `` ```                                       \r\n" + 
													"` ` `  `.hsosyhdmmmmmNNNdho-`` `     ```    `````````````` `+NNNNmmNNNNmmNmmddddmdhssydmmmdhy/.  ```  ``     `` `` `/yyo:``` ` `  ``` -hmNNNmmmNmmNNNmNNh-`` `                                          \r\n" + 
													"`   `` `.hyyyhhdddmmmmmmdddhs:.`          ````````  `` ```-+hmmmddmmNNNNNNNmmmmmmmhssyhdmmmddh+.`   ````     `````  ./+o/.     ` ```` `/dmmmmmNNdmNmmmmmh/``` ``                                        \r\n" + 
													" `` `   `:ymddmddddddddddddmdh+.          `           ``-hmNmmdmmmmmmNNNNNNNNNmmmddhhhdmmmNNmmh:``   `       `` ``   `.+o:` ```  ` `   `--omNNNmmNNmmmNNNm+`                                            \r\n" + 
													" ``` `  ``.odmNNNmddddmddmmmmmy:`     `   `     `` ````.ommmmmmmmNNNNNNNNNNmmmddmmmddddmmNNNNNms.``          ````      -os-``      ` ```` ./omNNNNmdmNNmNms.`     `````                                 \r\n" + 
													"    ``  ````.+hmNNmmmmmmmmmmmmmy.  `  ```      ``` ` .sdmmmmmmmmNNNNNNNNmh+::-:smdddmdmmNNNNNNNh: ``         ``     ````-+/.  ``       `` ` .ymNNmmdmNNmmds:`     ``                                    \r\n" + 
													" ` ````` ``  `.:oydmNNmmmNNNmNmh+-``  ` ````      ``-sNmmmmmNNNNNNNds//s/.`  ``/hdddmmmmNNNNNNms-``  `````````````````` `+s-  ``       ``    -:yNmmmNmmdmNmd+.``    `                                   \r\n" + 
													"  ` ```` `` `` ```.:ohmNNNNNNNNhs+-`  ``````     `:ydmmmddmNNNNmh+:-```` ```  ``/hmmmmNmNNNNNNdo.`` `````````````````````-+:` ``       ``  ``` -dNNNNmdmNNmhssy/``` `                                   \r\n" + 
													"````     ``  ```    `./dNNNNNNNmsoo:`  `  ` ```-/ohmmmmddmNNNNh/.` ````  ````````-ohmNNNNNNNNNmy:`` ``````````````````````--```````     ``` ``  +dNNmmmNNNNmmNNd-`` ``    `    `                        \r\n" + 
													"`````       ```  ``` `.hNNmNNNmmysy+- ``  `` `/dmmmmddddmNNmh+.````````````````````-+hmNNNNNNNNdo.```````````````````````````` ```````````````` `-dNmmNNNNNNNNdh:`  `  `  `    `                        \r\n" + 
													"``  ``    `  ```````.:smmmmmNmmdyhs+.  ``` `.odmmNmmmmmmNNNmo.```````````````````````/hNNNNNNNNmy:````````````````````````````````````````````````sdNNNNNNNNmddhs+:.``      ```                         \r\n" + 
													"    ``     ` ` ```-/shmmmmmmNmhyhyo:`  ````-smNNNNNmmNNNNmNmo````````````````````````-smmmmmmNNNms:.`..`......``````````````````````````````````.-:+mNNNNNNmddmNNdho-``                                 \r\n" + 
													"      `` `     ``:shdmmmdmmmNmdhho/.`` ````:dNNNmmddmNNNNmmh/```````````..............:sdmmmmmmNmdy+:-...........................```````````````.hmmNNNNNNmddmNNmmmmms:````` ``    ````    ````      `` \r\n" + 
													"      `` `  ```.:sdmmmmmmmNNmmmds/.```````.sNmNmmmdmNNNNNdo-.`.`.................-....-/ydmmmmmmmmmdy+:-.....--..........................````````sNNNNNNmmddmNNmNNNNddyo-```````````````````````````    \r\n" + 
													"     ``` ```.-/ohdmmmmmmmNmNmddyo.```````.omNmmmmddmNNNNNd/.......--------------------:ohmmmmmmmmmmdhhyo:--------------....................``````-odNNNmmdmmNNmmNNmmmNNmy/:---.--........```````````    \r\n" + 
													"     ``````-+yhdmmmmmmmmNNNmmhs+/`````.``:dmmmmmmmNNNNNNmy/-::::::::::::::::::::::::::/sdmmmmmmmmmmmmdhs+/:--------------------..............`````.dNNmmmmNNNNmmNNNNNNmmmmdy+///:::::-----...```````    \r\n" + 
													"        ``-ohdddddmmmmmmNNNmmh+--........:hNNNmdddNNMNNms+/////////+++++++++///////////sddmmmmmmmmmmmmdhy+/:----------------------.............```.+syhdmmNNNNNmNNNNNmmNNNmdyso////:::----....``````    \r\n" + 
													"         :ydmdmmmmmmmmmNNmmmdyo:----------:odmmmddMMNNNdsoooooo+++++++++++++/////////:+shdNmmmmmmmmmNNmmdyo+/::::::::-------------............``````..-::/+ssssyddmNNmmNNmmmdhy++/--.-.....`````````    \r\n" + 
													"   ``````+dmdmmmmmmmmmNNNmmNmhy//////////://+shdmmNNmhsoo+ooo++++++++++///////:::::::://odNmmmmmmNNNNNNmdhso+//////::::::-------...........``````````````........--:://///::--..`````````````  ````     \r\n" + 
													"   `````.+mmdNmmmmmmNNNNmNNmyso++++++++++++++++osssoo+++++++//+//////:::::::::::::------odNNmmmmmNNmmNNmmyo++++///////::::-----...........``````````````````````````````````````  ``  `      ``       ` \r\n" + 
													"`` ````..sddhNmdmmmNNNNNmNmhooooooooooooooo+++++++++////////////:::::::::::::-----------/ymmmmmmmmNmmmmmmyo++++++/////::::----.......``````````````````` ````` ````  ````    ```   `  `    ````         \r\n" + 
													"``  ```.-ydyhNhhdddmmNNNmdyo++oo+++++++++++++/////////:::::::::::::::::------------......:smmmmmmmmmdddmds++++////:::::----......``````````````````````````````````````````````                         \r\n" + 
													"````````../osyhyhdddhyys+///+///////////:::::::::::::--------------------------............-+yhdddyyhyyo/::::::------......```````````````````````````````````` ` ` ` ` ` ` `                           \r\n" + 
													"   ``````.`...--::-----------------------------------------------...................`````````..-:::--------.....`````````````````````````````````````  ````````````````````````                         \r\n" + 
													"   ```````````````````..........................................................`````````````````````````````````````` `````````````````````   ``               ` ` ` ` ` ` `                           \r\n" + 
													"        ````````````````````````........................................```````````````````````````````````````````````````````````````                                                                 \r\n" + 
													"           ````````````````````````````````````````````````````````````````````````````````````````````````````````````````````                                                                         \r\n" + 
													"             ```     ```    ````                        ````````````````````   ``````  ````                                                                                                             \r\n" + 
													"                                                                                                                                                                                                        \r\n" + 
													"                                                                                                                                                                                                        \r\n" + 
													"");
											System.out.println("Stats: 99999999Hp // 99999999 Damage");
											
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											System.out.println("Game: A demon begins iniate a battle.");
											System.out.println(" ");
											System.out.println("1: Accept your fate");
											System.out.println("2: Try and fight the Demon");
											System.out.println(" ");
											System.out.println("What would you like to do?");
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											
											int decision6 = myScanner.nextInt();
											
											if(decision6 == 1)
												{
													System.out.println("//n-------------------------------------------------------------------------------------n//");
													System.out.println("Game: You accept your fate.");
													System.out.println("Game: The Demon obliterates you immmediately.");
													System.out.println("Game: When you open your eyes you are at the gates of heaven.");
													System.out.println("Game: You are accepted into heaven and enjoy yourself.");
													System.out.println(" ");
													System.out.println("Achievment get: Early Trip to Paradise");
													System.out.println("//n-------------------------------------------------------------------------------------n//");
												}
											else if(decision6 == 2)
												{
													System.out.println("//n-------------------------------------------------------------------------------------n//");
													System.out.println("Game: You decide to fight the demon.");
													System.out.println(chooseCharacter2.get(3).getHealth() - chooseCharacter1.get(option).getDamage() + " Hp on Demon");
													System.out.println(chooseCharacter1.get(option).getHealth() - chooseCharacter2.get(3).getDamage() + " Your Hp");
													System.out.println("Game: The Demon obliterates you immmediately.");
													System.out.println("Game Over!!");
													System.out.println("Achievment get: What did you expect?");
													System.out.println("//n-------------------------------------------------------------------------------------n//");
												}
										}
									else if(decision5 == 2)
										{
											
											System.out.println("      `.:+oys:                                           \r\n" + 
													"                                                                                                                                                  `-/shhhdmh/                                           \r\n" + 
													"                                                                                                                                              ``-/shhdddmms:`                                           \r\n" + 
													"                                                                                                                                            .-+shdddddmNy/.                                             \r\n" + 
													"                                                                                                                                         `-oyhhhdddmNNNo.                                               \r\n" + 
													"                                                                                                                                        .+hdhdhddddmNMs`                                                \r\n" + 
													"                                                                                                                                     `:ohddhddddddddmN+`                                                \r\n" + 
													"                                                                                                                                  `-/ymNmmdhdmmmmdddmNh.`                                               \r\n" + 
													"                                                                                                                              ``-/shdmmmddhddmNNNmmmNMd.                                                \r\n" + 
													"                                                                                                                            `-+yyyhhhhhddddddddmNNNNNMd.                                                \r\n" + 
													"                                                                                                                          `-+yyhhhhdhhhdddddddddmNNMMMh`                                                \r\n" + 
													"                                                                                                                          :shhhhhdddddddddddddddddmNNMh`                                                \r\n" + 
													"                                                                                                                         .shhhhddddddddddddddddddddmNNy`                                                \r\n" + 
													"                                                                                                                         +hdddddddddddddddddddddddddmNd/`                                               \r\n" + 
													"                              `                                                                                         :ddddmmmNNmddddddddddddmmmmddmmm/`                                              \r\n" + 
													"                               ` ```                                                                                  `.mmmmNNNNmmdddddddddddddmmNNmmmmNh-                                              \r\n" + 
													"                               .:+o+-                                                                                 `oNNNNNmdhhhddddddddddddddddmNNNNNN+`                                             \r\n" + 
													"                              :ossyy/                                                                                `/mNNNmdhhhddddhhddddddddddddddmNNNMy-                                             \r\n" + 
													"                           ``:sosyho.`                                                                             `.:hNddhhhddddddddddddddddddddddddddNNm+`                                            \r\n" + 
													"                           .+yosydy-`                                                                             ./sydhhhhddddddddddddddddddddddddddddmdmho-`                                          \r\n" + 
													"                         `-osyysdNo`                                                                             `+hhhhhdhhddddddddddddddmmmdddddddddddmmdmmh+                                          \r\n" + 
													"                         -ossysdmmy:                                                                            `+yhhhddhhdddddddddddddddmmmNNNmmmdddddmddmmmh.                                         \r\n" + 
													"                        .+yyysdNdds-                                                                           `+hdddddhddhddddhhhdddddddddddmmNNNmmmmmmmmdmmh-                                         \r\n" + 
													"                       `+yyyyhmdy/.                                                                            +dNmmmmmdddddhhddddddddddddddddddmNNNNmmmmmmmmh-                                         \r\n" + 
													"                    ```+hhyyymmo-`                                                                            /mNNNNmmddddddddddddhhhddddddddddddmNNNNNmmmmmmd:                                         \r\n" + 
													"                     -shyyyshm+`                                                                            `/NNNNmmmmmdhhddddmmmmdddddddddddddddmmmNNMNNNNNNmo                                         \r\n" + 
													"                   `syhyyyydmo.-/++///-                                                                   `/ohdhhhhhdddhdddddmmmmNmmddddddddddddddmmNNmNNNNNNNd.                                        \r\n" + 
													"                  .syyyyyydmNmhhdddddd+`                                                                `/yhhhdddddddddhdddhhhhhhdmmNmdddhhhdddddddmmNNNNNNNNNNo                                        \r\n" + 
													"                 `:yyyhyyhdmdhhdddmddh:                                                                .oddddmmmdddddddddddddddddhhhdddddhhhdddddddddmNNMNNMNNNd`                                       \r\n" + 
													"                `:shyyyyhdddddyyyhhhyo.                                                               `smNNNNNNNNNmmNmmmdddddhhhhhddhddddhhdddddddddddmmNNNNNNMM/``                                     \r\n" + 
													"               `/yshyhyhmNmho-.``````                                                                `smNmmmddhhhhddddddddddhhddddddhhhhddddddddddddddddmmmNmNNNds:`                                    \r\n" + 
													"               -osyhhydmms:`                                            `:+/:-.`                   .:ohhhhhhhhhddhhhdddddddddddddhhhddhhhdddddddddddddddddmmmmmmNNd/`               ``.-.               \r\n" + 
													"              `/oohsshmd+.                                              `/hmdyso/:.`             .+yhhhdddddddddddddddddddddddddddddddddddddddmmmmmdddddddddmddmNNNs-     `..--:///ossys:`              \r\n" + 
													"              :ooshohmmo.                                                `:shmmdsoo/-`          `+dmmmmmNNmmmmmmddddddddddddddddddddddddddddddmmNNNNmmdddddddddmNNMd+..:/+oo++++++osyy+-`               \r\n" + 
													"             .oyohsyNmh:                `-/.                              `./ydmNhsoo/.`        .sNNNNmdddddddddddddddddddddddddddddddddddddddhdmNNNNNNmmmmmddmNNNMmhoooo+o+++oosyhh/.`                 \r\n" + 
													"            `oysyyymdNy.                :oyo/.`                             `.:sNNmyooo/-`     `/ddhhhhhddhhhhhhhhhdddddddddddddddddddddddddddddddmNNMMNNNNmNNNmhyso+oooosssssyhddh-                    \r\n" + 
													"          `-oosyysdmdN/`                ooodds:                                `NmNmhs+++o/:-.:syhhhdmmmmmmddddhhdddddddhhhddddddddddddddddddddddddmmNNMMMMNmhsoooyhhyyyhhhdddmmdh-`                    \r\n" + 
													"        `-+ooosyydmmmo.                 +s+hmh+`                                ohdNNmhoooosshdhhhdddddddddddddddddddddddddddddddddddhhdddddddddddmmmmNMNNdyoosssymNNNNNNNNNmdhhy+`                     \r\n" + 
													"       `-yssyyyydmmm/.                  os+hmds.                                -yydNNmhysssdmmhhhhhdddddhdhdddddddddddddddddddddddhhdddddddddddddmmNNMmhsssssyydmNNNmmmmmdhdhsss.                      \r\n" + 
													"       .osyhmmdmNNd/                   .ms+hddy/                                `oyddmmNmhhhmNmhyyyyyyhhdddddddddddddddddmmmmmmddddddddddmmNmmddmmNMMmhsssssyhdmNNNNmmdmmdhhdsoo/                       \r\n" + 
													"       `/ssdNNmmmNh-                 `-smoohddh+                                 -syhddmNNNNMmhyhdddhyyyyhhdddddddddhdddddmNNNNmmmddddddmNNNmddmNNMNdyssssyhdNNNNNmmmdddddhhs+so.                       \r\n" + 
													"         :syhdmmdyhh/.`             `/yhy+sddds-                                 `-+syhdmNMMMmmNMNNNNNmdhyyyhhhdddddddddddddhdmNNNmmddddmNNNdddNMNmhssydhdmNNNNmmdddhhhhhhyoos+.                        \r\n" + 
													"          ./osyddysshh/.           .+yyh/ohdds-                                    `-+shhmNMNNMMNmdhhdmNNmdhhyyhhyyyyyyyhhdddhhdmNNmmddddmNmdmNNNdhysymmNNMNNmmmmdhhhhhssoos+-`                         \r\n" + 
													"            .:oyyyysshds:`        `/yyhs+ymdo-                                      `./yhmmNNNNNNdyo++oshdmmNNmmmmmmddhhyyyyhddhhdNNNmddddmddmNNmhyssdMNNNNNmmmmdhhhhyyso+:.`                           \r\n" + 
													"              .:oyyhhsydds:.`     :yhyy+ymmo.`                                       .+symdNNNMMNNmdhyo++oyhdNMNMMNNmNNNmdhyyydddhdmNNmdddddmNMNdhysyNMmNNNmmdmddhhhyys:``                              \r\n" + 
													"                `:ssyhyyhdmhs:`` .smhhosmms-                                         .+ysdmmNNNMMMMNmmmmhsoshMMNNmyosyhdmNNhyyydmhhhmNmdddddmNMNdhyydMNNNNmddddhhhdhyyo`                                \r\n" + 
													"                  .+sssyyyhmNNyo+ymNmsohmd:`                                     `  ./oosNddNNNNMMNmhsymNNmmNNNNms+ossyydmNNhyyhmddhhmNmddddmNMNdhyhdMNNNmmdddhhhmmyhds`                                \r\n" + 
													"                   `/syyyyyydNNmddNNmyymms.                                         :++ooNydNNNNMNNNhsohNMNNNmmmNmdhhhhdmNNNdyshmmdhddmmddddmMMNdhdmNMNNmmddddddNdsymms.                                \r\n" + 
													"                    `./syyyyyhmNmhhmmhhmd/`                                       ` `-+osyyydNNNNmyyddmmNdssyhhmNNNNNNNNmhhmmhsyhmmdddddddddmNMNmmmNNNNmddhhdmNNhsymNms`                                \r\n" + 
													"                       -oyssyyhmmdyyhdmNd:`                                           ````/yhmmNNdhhdmNmy++osyydmNNNMMMNmddmNmhyyhmddddhddddmmNMNNNNNmmdddddddhsoyNNNd+                                 \r\n" + 
													"                        ./sssyyhmdhyydNNdo.                                                /ymmNmy+shmms/+syyhdmNNNNMMMMmmdmNMNhyyymddddddddmmNMMNNNNmmdhhmNmdyymMMNNy.                                 \r\n" + 
													"                         `-osshyhdhyymmNNm:`                                                .+hmNdo+hds+osyhddmmNNNNmmmNMNmdmNMNyyshmddddddmmmmNMMMMMNNdysdMMMMMMMMMNs`                                 \r\n" + 
													"                           .+ysyhyyyydmNmmo.                                              `  .smNNmydh++syddmNNNmhysosydMNhoohMNyssdmdddddddmmmNNmddhyssyhmMMMNNNMMNNd/                                 \r\n" + 
													"                            `/ysyhyshdmNmN+.                                               `  /hmNNNmo+shdmmmmdyssyhmmmmMMNhyhNmyyymmdddddddmmmNNmmdddmNNNNNNmmdmNMMNmo`                                \r\n" + 
													"                              /ysyhyydmNNm/`                                                  `+dmNMy+ohmNNdhysydmNMMMNNNNMNmmNmyyymmddddddddmmNNMMNNNmmNNmdddmmNmNMMd+`                                \r\n" + 
													"                              .ysyhyyhmmNy.                                                    -smNMo+ymNmhyydmNNNMNNmmmmmmNNNNNhssmmdddddddmmNNNNNmmmdmNNmdddmmNNNNMh-`                                \r\n" + 
													"                               sssyhhyyhm+`                                                    `/dNN/odmhyhmNMNNNNNmdhhhyyddmmNNmyyhmmddddddmNNMNNmmddddddddddddddmmNd/`                                \r\n" + 
													"                               /oosyyhyhm/`                                                     .sNhoyyyhmNNmmmNmmNdyysssydoodMMNdyshmmdddmmNMMNNmmdddddddddddddddddddds:                               \r\n" + 
													"                               .o+syyhhhm/`                                                    `:hNhoshmNMNmmdmmhdmdysssymy:/hMMMNhyydmmddmNMMNmmddddddddmmmmddddddddddmdo`                             \r\n" + 
													"                               `:+osyydhNo.                                                   .+hmmdydNMMMNNmmmdhhddhyyydNhhhmmNMNNyyhdmmmmNMNmmddddddmmmddddddmmmNmmmmmmN+`                            \r\n" + 
													"                                `+oosyddmh-                                                `.+ymNmdmmNMMMNdysossyhhdddddhyyhdmmNMMMdyyhmmmNMMNmmmddmmNmdhhhdmmNNNNNNNNMNNNd.                            \r\n" + 
													"                                 /oosyhmmd:                                               `:yhddmmdddmNNNNNdhhhhysyhhyysyyhdmmmNMMMNyyhdmmNMMNmmmmNNNdhhhdmNNNNmmmmmmmNNMMN.                            \r\n" + 
													"                                 :ossyymmN:`                                              `smdhhddhddmNNmNNdyhdhhhddhhysssyyhdmNMMMNhyydmmNMMNmmNNNmdhhhdmNNNmmmmmdmmmmmNMy`                            \r\n" + 
													"                                 -ossdydmM/`                                               /mNmdddddddNmdmNmsohddddhysssysyhdmNNMMMNhyydNmNMMNNNNmdhhhdmNNNmmdddmdddmmmmmN/`                            \r\n" + 
													"                                 -ossdyhmM/`                                              `smNNNmmddddmmdmNNmyshmdyssssyyydmNNMMMMMNhyhdNNNMMMNmddhhddNNNmmmdddddddmmmmmNNs. `                          \r\n" + 
													"                                 -ooodyymN/`                                              /NmmmNNNdhddmdddNMMNmNMmyyyyhhdmNNMMMNMMMmhydmNNNMMNmddddmmNNmmddddddmmmmdmmmNNMNo`                           \r\n" + 
													"                                 :oo+hhsdN+`                                            `:dNMNmmNNmhddmdddmMMMMNNNNNNNNNMMMMNNMMMMMdyhmNNNNMNmmddmmNNNmddddddmmNmddddmmmmNNNo.                          \r\n" + 
													"                                 :ooohdydNo.                                          `-+mNNMNmdmNmhmmmdddmNMMMmmmmmmNNNNNMMMMMMMNNdhddmmMMMNmmmNMNmmdmdddmmNNmmdddddmmmmmdmmy:`                        \r\n" + 
													"                                 -osoddsdMy.                                        ./syhmmNMNmdmmmhNNmdhdmMMMNmddddddmNNNNNNmmmNmdmNNNNmmmNNMMNNNmmmmmmmmNNNmmmmddddmdddmmmmmds:`                      \r\n" + 
													"                                 `+ysdNydMm/`                                      `/hdhhhhmNNmdmmddNMNmddmMNNNNmddddmmmmddhhddmNNNmmhys+//ohmNNNNNNNNNNNMMNmddmdddddmmmNNmmmmmNd+`                     \r\n" + 
													"                                  :yddNdNMMy:---.``....`                           :yNNdhhhdNNNmmmdmNNMNmdmNmmmNNmdddddddmmmmdhhy++/://+oo+++++shdmmmNNMMMNmmddddddmNNMMNMMNNNmmNd:                     \r\n" + 
													"                                 `.oNNMMNNmdddmdh+ssssso/`                        /yddNNdhhhmNNmmmmmmmNMNmmmddddddmmmmmmdhso+/::::++++++++oshhdddddmmNmNNNNmmddddmNNNNNNNNNMMMMNNm+                     \r\n" + 
													"                               `:+syhhysossyhdNNNMMhssydy.                       /yhhddmNdhhdNNmmmmmmmmNNmmmmmNNNNmdhyso/:/oossooosssyhddddddmmNNNNNNNmNNNNmmmmdmNNNmmdmmmmmNNMMNd:                     \r\n" + 
													"                               +yo+++oossyyhdNNNMMMmhyhmh:`                   `./hdhhhdmNmdddmNNdhddmNNNNNNmmmdyhysooosoooosyyyhhhddddddddhhhhhhdmNNNmdNMNNNmmmNNNmddddddddddmmNNs`                     \r\n" + 
													"                               osoosyyhddmNNNNNNMMMNmdhhddy+.`              `.+smNmhhhdmNNdddmmhyhdmNMMNmmmdhhyyhhhyhhdhhhhhhhhhhhhhhhhhhhhhhhhhhhdNNNmMMNNNNNNNmmdddddddddhdddmdo`                     \r\n" + 
													"                             ` .shdmmmmmmmmddddmNNMMNdhhdmNNyo/-.` `       `-yhhdNNdhhddmMmddmdhyyyyhmNNNmmdddmmmNmddhhhhhhhhhhhhhhhdhhhhhhhhhhhhhhdmNMMMNNMMNmmmmdmmmNNmmmdmdddmdy:                    \r\n" + 
													"                              `.oyysoo+++oosshdmNMMMMNmmNNNMddNmyo/-`      .omyydNNmhhdddNNddmdyyyhhyyydmNNNmNMNNmhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdddddNMMMMNNmmdmmNNMMMMMMNMNNNmmNNm.`                  \r\n" + 
													"                             ` `so++oosyhdmmmNMMNMMMNs//smMMdydmmmddhys:-.-odNdyddNNmddddmMmmmhyddymNdhmNNmNMMNNNMNdhhhhhhhhhhhhhhddddddddddddhhddddddNMMMNNNNNMNNNNmmNNNNNNMMMNmdmNs`                  \r\n" + 
													"                                :odmmmmmmddddddmNMMMNy/:odMNhyydNmmdhmNmddmNMNmhhdmNNmddmmMNNmhyddymNddmNNNMMmyydNNmdhhhhhhhhhhhdddddddddddddddhddddddNMMMMMMMNNmmdddddddmmmNNMMNmddd:`                 \r\n" + 
													"                               ``+ssooooooosyyydmMMMMd++hNMmyyyhmNmdhhNNmdmNMMNmhddmNNmmmmMMMmhhhhdddhdNNNMMNyoshmNNdhhhhhhhhddddddddddddddddddddddddmMMMMMNNNmdddddddddddddmNNMMMMmmo.                 \r\n" + 
													"                                 /oo+osyyhhddmmNNMMMMMdymMNdyyyhdmmdhhdNmddmNMMMddddmNNmmNNNMdyhdddhhdmNMMMMNysydNNNmdhhhhddddddddddddddddddddddddddmmMMMMNNmmddddddddddddddmmNNMMMMNo.                 \r\n" + 
													"                                 `/yddmmmmmmmdddmMNNNNNNNNdyyyyydmNmdhdNmdddmNMMNdddmmmNNNNNNy+/+shmmmNMNNNMNdssmNNNmdddhdddddddddddddddddddddddddddmNMMMNNmmdddddddddddddmddmNNMNmy/.`                 \r\n" + 
													"                                  `/ys+ooosyyyhdNMMMMMMMMmhyyyyhdmNmdhmNmmddmNNNMmddmmNNmyhmNdso++/+shNNmdNMMNhydNNNNmdddddddddddddddddddddddddddhddmNMMMNNmmmddddddddddddmdmmNNNy.                     \r\n" + 
													"                                   ./oshdmmNNNMMMMMMMMMMNmhyyyyhdNNmddNNmmdddmNNNNmmmmNNysossyyhddyssymmmmNMMNdyhmNMNmdddddddddddddddddddddhhdddhhdmNMMMMMNNmmdddddddddddddmmmNMh-                      \r\n" + 
													"                                    `.-:-yNMMMMMMMMMMMMMNdhhyyhdmNmddmNmmdddddmmmNmmmmNmyho++/++osdmmmNNNNNMMNhyyhmNNNNdddddddddddddddddddddddddmmNNMMMMMMMNNmmmddddddddddddmmNmo`                      \r\n" + 
													"                                         :dNNNNMMMNMMMMMNdhhhhhmNNmmmMNmddddddmdmmmNNmmmmdyysooooosyyyyyhdmNNNmdhhhmNNMNddddddddddddddddddddmmNNNMMMMMMNNMMNNmmmdddddddddddddmNd/                       \r\n" + 
													"                                         `sddddNNMMMMNMMmhhhhhdNMNmdmNmdddddddmmmmmmNmhyhdNmdhyyssssssyyyyyyhdmmdhhhmNMMNmdddddmmmdddmmmmNNNMNNNNMMMMMNmmmNNNNmmddddddddddddmmmy-                       \r\n" + 
													"                                          +yyhhmNMMMMMMMmhhhhhmNNNmmNNdddmmmmmmmmNNNNmhso+ohmNmdhyssssssssyyyhhyyyyhdmNMMNmmmmmmNNNNNNNMMMMMMNNNmmmNNMNNmdddmNNNmddhhddddddddmmd+`                      \r\n" + 
													"                                          .syyhdNNMMMMMMmhhyhhdmNNmdmmdddmmmmmmmNNMMMNmdyso+osdmdhhhhhyyysyyyyyyyyhhdmNMMMNNNNNNNNNmmmNNNNNNNMNmmdddmmmmmmddddmNNmmddddddddddmmNh-                      \r\n" + 
													"                                           /syyhmdMMMMMMNhdyyyhdNNmmddddmNmmmNNNNNNMMNmmmmdhysyyyyyhhhyyssssyyyyhhhddmNMMMMMMNNmmmmmdddddhddmNNNmmmdddddddddddddmmmddddddddddmmNm+                      \r\n" + 
													"                                           .oysymhNMMMMMNddyyyyhmNNmdddmNNmmmNNNNMNMNdyhhydmmmdysssssssssssssssyhdmmmmNMMMMMMMMNmdhhhhyyyyyyhhdNNNmmmdddddddddddddddddddddddmmmmms                      \r\n" + 
													"                                           `/ssydydNMMMMNddhyyyydNNNmdmNNNNNNNMNMNmh+-/hhssyhdmhyyyyhyysssssyyysyyhdmmNNNNNNNMMMNmddyyyyyyyyyyydmNNmmdddddddddddddhhddddddddmmmNmy`                     \r\n" + 
													"                                            `/ysyhymNMMMNddhhyyhdNNNmmNMMNNNNmds+/.`` `:dNmmdhyysyhhhyyssssssyyysyyyyhhdmmddmmmNNMMmdyyyyyyyyyyydmNNmmdddddddddddddddddddmddmmmNmo                      \r\n" + 
													"                                             .+ysdydNNNMNdddhhhdmNNNmNMMNmhs+-``       .smdmmmmmhyssssssssyyyyyyssyyyyyyyhhdddddmNMMNdhyyyyyyyyyyhmNNNddddddddddddddddddmmmmmmNNh-                      \r\n" + 
													"                                             `-sohyhNNNMNmdmddmNNMNNNNNho:.`           `-odhyhdddhhhhhyyyyyyyyhhhhhhhhhhhhhhddmmmNMMMNdyyyyyyyyyyyhdNNmdddddddddhhdddddmmmmmmmNh:                       \r\n" + 
													"                                              .+oyhdNNNMNNmmmNNMMNNNds-`                 -hdmmdddhhddhyyyyyyyhdddmmmmNNNmmmmmmmNNNNMMMNdyyyyyyyyyyyydmNmdddddddddhdddddmNNNmNNh/`                       \r\n" + 
													"                                              ./oodmmmNNMNNNNMNmdhs+-`                   :yoshmNNmddhddddddddmmmmmNNNNNNNMMMMNNNNNNMMMNdyyyyyyyyyyyyhdNNmddddddddhdddddmNNmNNd/`                        \r\n" + 
													"                                              ./sodmmmNMMNmdyo/-.``                     `os+/+oyhmNMNNMMMMNNNNNNNNNMMMMMMMMMMMMMMMMMMMMmhyyyyyyyyyyyhdmNmddddddddddddddmNNNNh:`  `                      \r\n" + 
													"                                              `/s+hNmmNms:.                             `ho//++++shNmmmmNNNNNNNNNNNNNMMMMNNMNNNNNNNMMMMNdyyyyyyyyyyyhddNmddddddddddddddmNNNo.`                          \r\n" + 
													"                                              ./s+hmmmNh:                               .hyyoo++/+smdddhddddddddddmmmNNNMNNNNNNNNNNNNMMNdyyyyyyyyyyyhddNmdddmmmddddddddmNNo`                            \r\n" + 
													"                                             `:ss+ymNmms.                              `:ssyyhyyo+smddhhhdddddddddddmmmNMNNNNNNNNNNNNNMMmyyyyyyyyyyyhdmNmmdmNmmmmdddddmmmo`                             \r\n" + 
													"                                             /dmy+hmmNh:                               `/syyhyyhhhhNdddhhddddddddddddmmMNNNNNNNmmNNNNNMMNhyyyyyyyyyyhdmNNmmmNNNmmddddmmmd`                              \r\n" + 
													"                                            .ommsohmmNy.                               .osdhhmmhyhmNmdhhddhhhddddddddmNMNNNNNmmmmmNNNNNNNdyyyyyyyyyyhmNNNmmmNNNmmdddmmmmd                               \r\n" + 
													"                                            .oddsshmmNo`                               .syddhmmdyhmNNNmdhhhhhhhddddddmNMNmNmmmmmmmmNNNNNNmyhyyyyyyyhdmNNmmmNMNNmmmdmmmmms                               \r\n" + 
													"                                            `+hsshydmm/                               `:hyyhddhyydmNmNNNmdhhhhdmmmmNNNMMMmmNmmmmmmmNNNNMNdyhyyyyyhhhdNNmmmmNMMNNNmmmmmmy-                               \r\n" + 
													"                                            `+yosdymNh:                         `   `.+hmddhyyyhhdmNNNNNNNmmmNNNNNMMMMMMMNmNNmmmmmmNNNNNmhyhyyyyyhhdmNNNNmNNNNMNNmmmdy/`                                \r\n" + 
													"                                            `/yosdhmMs.                           `-oyhdmmmNmdhhddNmmNNNNMMMNNNNNNMMNNMNMNmNNmmmmmmNNNNNdhhhyyyyyhhdNNNNmmNMMMNdyo+:.`                                  \r\n" + 
													"                                             /hosdhmN+`                         `/shhhhdddmmNNNNNNNMMMNmNNNNNNNMNNNNMMNNMMmmNmmmmmmNNNNdhddyyyyyyyhdNNNNmNNMMm/.                                        \r\n" + 
													"                                            `/y+sddNd:`                       `:hhyhhddddddmmmNNNNNNMMmddmmmmmmmmNMMNNmNMMmmmmmmmmNNNNmhhddhyyyyyhhmNMMNNMMMMm:                                         \r\n" + 
													"                                            `/y+sddNy-                        `odyyhdddddddddmmmNNNNNMdhdmddmmNNNNNmmmmmNMNNNmmmmmNNNNhyddhhyyyhhhdmNMMMMMMMMm:                                         \r\n" + 
													"                                            `/y+yddNo.                         .NhhhddddddddddmmmmNNNMmdddddmmmmmdddddmdmMNNNNmmmNNNNhhdddhhhhhhddmNMMMMMNNNNm:                                         \r\n" + 
													"                                            `/y+hhdN+.                        `-MmhhhddmNmmddddmmmmmNNNNmdddddddddddddmhNMMNNNNNNNNmhyhmddhhhhhhdmmNMMNNNNNNNm/                                         \r\n" + 
													"                                            .+s+dydm/`                       `-hNNmhhhdmNNmmddddddmmNNNNNmddddddddddddhdMMMmmmNNNMmhydmmddhhdddmmNNMMMNNNNNNNms`                                        \r\n" + 
													"                                            :oosdhmd:`                       .smmNNdddddmNNmddmmddddmNmhmNmdhhdhdddddhhNMNNNdmNNNNhhdmmddhddmmNNNMMMNmmmdmNNNNd.                                        \r\n" + 
													"                                           `/o+yhhMy.                       .+mdmNNmddddmNNNmmmdddddNNhydNNmdhhdddhdmmNMMNNNddmNNhhNNNmmmmNNNNNNNNNNmmddddmNNNN+                                        \r\n" + 
													"                                           .+oohhmMo`                      `:hdhdmNNmddddNMNmmddddddNdshddmmmdhddhdmNNMMNmNNNdhdmdNNNNNNNNMMMNNNmmmmmddddddmNMMd                                        \r\n" + 
													"                                           :oosyhNM:`                      .omhdddmmmddddmMNmmddddmdNysddhhddddddmNNmmMMNmmmmNmNNMMNNMNNNNNMMMNmmddmmmddddddmMMM-                                       \r\n" + 
													"                                          .ososymMd.                      .+dddddddddddddmNNmddddmNmmsydddhhhhddmmmdhdNNmmmdmmmmmmNNNNmmmmmNMMNmmddmmmdmmmdddmNM+`                                      \r\n" + 
													"                                          /ssoshNMo`                    `-ymNdddhddddddddmMNdddddmNNNhyhdhhhhhddddddhdNMmddddddddddddddddddmNNNNmmddmmmmmmmmddmNy``                                     \r\n" + 
													"                                         `ssosyhNM:`                   .+hmNmdmddddddddddmNmdddhhdNNmNhyhdhhhhhhddddddNNmddddddddddddddddddddmNNNmmddmNNNmmmmmddd:`                                     \r\n" + 
													"                                         -yooyydNm.`                 `:hmmmmmdddddddddddddddddddddmNNmmhyddhhddhhdddhdmNmdddddddddmdddddddddddmmNNmmmmmNNNNmmmmmmh:`                                    \r\n" + 
													"                                         :sosyhmNy`                `.omNNmdhhhdddddddhhdddhhddddddmNMdmmhydddhhdddhhdmNmdddddddddmmmmdddddddddddmmmmmddmNNNNNNmmdmh:`                                   \r\n" + 
													"                                         :oosyhmNo               `./hNmddhhhdddmddddddddddhdddddddmNMNdmmhyddhddhhhdmmdddddddddddmNNmdddddddddddddddddddmmNNNNNNmmNo.                                   \r\n" + 
													"                                         :ooshhmN+              `:yddhhhhdddmmmmdddddddddddddddddddmNMmdmmhyhdhyhdNNmddddddddddddmNNmddddddddddddddddddmdddmNNNNNmNs.                                   \r\n" + 
													"                                         .ooshhmmo              .odhhdddmmNNmddddddddddddddddddddddmNMNddmNdyyhmNNmdddddddddddddmmNNmdddddddddddddddddddddddmmNMNNMs.                                   \r\n" + 
													"                                         `ooshdmmy.             -smdmdNNNNmddhdddddddddddddddddddddmNMMmddNNmmNNmddddddddddddddmmNNNmdddddddddddddddddddddddddmNMMN+`                                   \r\n" + 
													"                                          +osydmmd-             -yNNNNNmmdhhdddddddddddddddddddddddmNNMNddmMMNNddddddddddddddddmmNNNmddddddddddddddddddddmddddddmNm:                                    \r\n" + 
													"                                          /ssyddmN:            `:hNNmdhhhhhdddddddddddddddddddddddddmNNNmdmMMNmddddddddddddddddmNNNMNddddddddddmmdddddddddmmmmmddmd/`                                   \r\n" + 
													"                                          -osyhhmM+`          `:ydhhhhddddddddddddddddddddddddddddddmNNNmdmNMNmddddddddddddddddmNNNMNddddddddddmmmdddddddddmmmmmdddh/`                                  \r\n" + 
													"                                          .ooshhmNs`         .ohhyhhddddddddddddddddddddddddddddddddmmNNmddNNNdddddddddddddddddmNNNMNdddddddddmmmmdddddddddddmmmmdmNy-                                  \r\n" + 
													"                                          `+oshyhNd.        -syyhhdddddddddddddddddddddddddddddddddddmNNNddNNmdddddddddddddddddmNNNMNdddddddddmmmmdddmdddddddmmmmmmmd/                                  \r\n" + 
													"                                           +oshyymN:`      `hhhhhdddddddddddddddddddddddddddddddddddddmNNddmmmdddddddddddddddddmmNNMNmddddddddmmmmdddddmdddddmmdmmmmNs`                                 \r\n" + 
													"                                           /+ohyhdMo.     `:dhhhhdddmdddddddddddddddddddmmddddddddddddmmNmdddddddddddddddddddddmmNNMNmddhdddddmmmmdddddmmmmddmmmmmmmNh:                                 \r\n" + 
													"                                           -+oyhhhMh-     .shhddddmmmdhddddddddddhdmmmmmmNmdddddddddddddmmddddddddddddddddddddddmmNMNmddhddddmmmmmddddddmmmmmmmmmmmmmdo`                                \r\n" + 
													"                                           .+oshhhmm/`  `.+dhdddmmmmddhdddddddddhdddmmNmmMNNmdddddddddddddddddddddddddddddddddddmmNMNmddhhdddmmmmddddddddmmNNmmmmNmmmmd+`                               \r\n" + 
													"                                           `+sshhhmN+`  .+ddddmmmmddhdddddddddddhdddddmNNNMMNmdddddhddddddddddddddddddddddddddddmmNNNmdhhdddmmmmmddddddddddmmNNNNNNNmmNd+                               \r\n" + 
													"                                            :syyhddNo. `/dddmmmmmddhhhhdddhhddddhdddhddmNNNMMNmdddddddddddddddddddddddddddddddhdddmmmddhdddmNmmmmmdddddddddddmmmNNNNNNNNm/`                             \r\n" + 
													"                                            .+hshdhNy-`:ymmNNNmdddddddddddddddddddddhhdmmNNNNMNmdddddddddddddddddddddddddddddhhddddmmdddddmNNmmNNmddddddddddddddmmmNNNNMNNs.                            \r\n" + 
													"                                            `/yoymhMd::ymNNNmdddddddmmddddddddddddddhddddNNNNMMNmddddddddddddddddddddddddddddhhddhdddddddmNMNNNNmddddddddddddddddddmmmNNNNMs-`  `                       \r\n" + 
													"                                             -oyyNdMmshNNNmdhhddmNNNNNNmdddddddddddddddddmmNNNMMNmmddddddddddddddddddddddddddddddhhdddhddNNNNNNmdddddddddddddddddddddddddmmmy/.`                        \r\n" + 
													"                                             .+dhMNMMNNNdhhhdddmmmmddddddddddddddddddddddddmNNNMMNmmmddddhhddddddddddddddddddddddddddhhdmNNNNMmddddddddddddddddddddddddddddddhyo:                       \r\n" + 
													"                                             `:hmNMMNmmdhhddddddddddddhhddddddddhddddddddddmNNNNMMNmmddddddddddddddddddddddddddddddddddmNNNNNNdddddddddddddddddddddmmmmmmmmmdmdmy-                      \r\n" + 
													"                                              -sNMNNdhhdddddddhddddhhhdddddhhdddddddddddddddmNNMNNNNmddddddddddddddddddddddddddhhhhdddmNNNNNNmdddddddddddddddddddddddmmmmmmNmmmmdo                      \r\n" + 
													"                                              `+NNdhddmddddddhddddddddhhhhhhddddddddddddddddmmNMNNNmmmdddddddddddddddddddddddddhhddddmNNNNNNmddddddddddddddddddddddddddmmmNNmNNNmh.                     \r\n" + 
													"                                             `:ymmdmmmddhdddddddhhyyyyyyyyyyyyhhddmdddddddddmmmNNNmmmddddddddddddddddddddddddddddddmmNNmmNMNdddhhhddddddddddddddddddddddmmdmmmNNNms-`                   \r\n" + 
													"                                            `:hNmNNmddhdddddhhyyyyhhddmmmddhhhyyhhdmmdddddmddmmNNNNmddddddddddddddddddddhdddddddddmmmmmmNNNdddddddddddddddddddddddddddmmmddmmmmmNNNd+.                  \r\n" + 
													"                                            -sNNmddddddddhhyhddmmNNmNNmmmNNNNNmdhhhhdmmmddmddmmmNNNmmdddddddddddddddddddddddddddmmmmmmmmNNmdddddddddddddddddddddmddddddddddddddmmmNMNs-`                \r\n" + 
													"                                          `-odmddddddhhhdmmmNNmNNmmmdhhhhddmmNNNmddhhddmmmdddmmmmNNmmddddddddddddddddddddddmmmmNNmdddmmmNNdmmdddddddddddddddddhhhhhhhdddmmNNNNmmmmNNNNs-`               \r\n" + 
													"                                       ` `+hddhhhhhddmmNmmdhhhddmmho+oyysyyhmNNNNNmddhddmmmmmmmmmNNmmdddddddddddddddddddmmNNNNNNmdddmmmmNmmmdddddddddddddhhhhhhhddmmNNmmmdmNNNNmdhdNNmms/:..`           \r\n" + 
													"                                        `odmmmmmNmdddmmhs+oyhhmdyo++sysssssyhmNmNNNNdddddmmmmmmmmNNmmddddddddddddddddmmNNNNNNmmddhdddddmmdmmddddmmmdddhhhhhhdddmNNNmmdhyyhssssoosyhddhyhddhyy+:::-.`    \r\n" + 
													"                                    ``.-smddmmdysyddddddhyhddddhyyysyssssyyyhdmNNMMNNmddddmmmmmmmNmmmmddddddddddddddmmmmmmmddddhhhddddddddddddddddhhhhhhhddmmNNNNNmdhyyyys+oo+osyhyyhhdhyyyhddhddyhs:`  \r\n" + 
													"                                  `.:+ssNdhyyhhhhmhyyhhhhdmmdhddddhhysyyyyhhdmmNNMMMMNmmdddddmmmmmmmmmmmddddddddddddddddddddddddddddddddddhhhhhhhhddddmNNNNNNNNNmmmdhyyyssssssydy+/::/sddhhyoodms/+yy+` \r\n" + 
													"                                 .::/ohdo/oyddhddo/+oydmmNdo///oydmmhyhhhhdddmNNMMMMMMMNNmmmddddddmmmmmmmmmmmmmmddddddddddddddddddhhhhhyyyyyyyhhddmNNNMMMMMMMMNNNNmmddddhysssyhdy/-----smNdo--:dho/+yyo`\r\n" + 
													"                            `   .//:+yh:.:shdmmd/.-:oydNNh:---/oyhdmhdmmmddmmmNMNNNNNNNNMMNNNNmmdddddhhhhhhhhdddhhhhhhhhhhhyyyyyyyyyyyyyyhhddmmNNNmmddmmmmmddmNMmNNNNNMNNmdyyyhmmds/:--/hMMms+:/sysyy/-`\r\n" + 
													"                               `:ossydy-:ymMMNNh--/ydmNNms.-:/oydmmddmmMNmmmNMNmdddddhddddmmmmmmmmdddddddddddddhhhhhyyyyyyyyyyhhhhddddhhyyssooo++/::::::://///ossyhdmmmmmNNNmmmmNMMNdy//hMMNdso++-``.`  \r\n" + 
													"                              ` .---::+/ydmNNmmh/omNMMMMmo--+hmNNNNmmNNMMNNNNdyssooo+//:::::::////////++oooossyyyyhhhddhysooooo++//::--....``.```````````````````..--:://+oyhddmmmNNNmyoss+:-.`--`      \r\n" + 
													"                                    ``./:::::::+ysshddmdhy::mMMMMMNNmdyyyhhyo/-----......................````.....-.....`````````               ``                      `````...---:::+/-` `            \r\n" + 
													"                                               `.```....-+yhoyyyyso+:--....```  `          ````                                                                                                         \r\n" + 
													"                                                         `..                                                                                                                                      ");
											System.out.println("Stats: 20Hp // 5 Damage");
														
											
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											System.out.println("Game: You have left the item alone and continue with the job.");
											System.out.println("Game: You see one last monster next to a tree.");
											System.out.println("Game: A Goblin initiates the battle.");
											System.out.println(" ");
											System.out.println("1: Attack Goblin");
											System.out.println("2: Run");
											System.out.println(" ");
											System.out.println("What would you like to do?");
											System.out.println("//n-------------------------------------------------------------------------------------n//");
											
											int decision7 = myScanner.nextInt();
											
											if(decision7 == 1)
												{
													System.out.println("//n-------------------------------------------------------------------------------------n//");
													System.out.println("Game: You attack the Goblin.");
													System.out.println(chooseCharacter2.get(2).getHealth() - chooseCharacter1.get(option).getDamage() + " Goblin Hp");
													chooseCharacter2.get(newGoblinHealth).setHealth(chooseCharacter2.get(2).getHealth() - chooseCharacter1.get(option).getDamage());
													System.out.println("//n-------------------------------------------------------------------------------------n//");
													
													if(chooseCharacter2.get(2).getHealth() > 0)
														{
															System.out.println("//n-------------------------------------------------------------------------------------n//");
															System.out.println("Game: Goblin is going to attack.");
															System.out.println(chooseCharacter1.get(option).getHealth() - chooseCharacter2.get(2).getDamage() + " Your Hp");
															System.out.println(" ");
															System.out.println("1: Attack Goblin");
															System.out.println("2: Run");
															System.out.println(" ");
															System.out.println("What would you like to do?");
															System.out.println("//n-------------------------------------------------------------------------------------n//");
															
															int decision8 = myScanner.nextInt();
															
															if(decision8 == 1)
																{
																	System.out.println("//n-------------------------------------------------------------------------------------n//");
																	System.out.println("Game: You attack the Goblin.");
																	System.out.println(newGoblinHealth - chooseCharacter1.get(option).getDamage() + " Goblin Hp");
																	System.out.println("Game: You have beaten the Goblin.");
																	System.out.println("Game: You have completed the job.");
																	System.out.println("Game: You got paid and decide to drink the reaminder of the day away.");
																	System.out.println(" ");
																	System.out.println("Game Over!!");
																	System.out.println("Achievment get: Make it Rain");
																	System.out.println("//n-------------------------------------------------------------------------------------n//");
																}
															else if(decision8 == 2)
																{
																	System.out.println("//n-------------------------------------------------------------------------------------n//");
																	System.out.println("Game: The programmer seems very irritated that you just ran.");
																	System.out.println("Programmer: I don't know why I give you these options, but lets just say......");
																	System.out.println("Game Over!!");
																	System.out.println("Achievment get: Irritated Programmer");
																	System.out.println("//n-------------------------------------------------------------------------------------n//");
																}
															
														}
													else if(chooseCharacter2.get(2).getHealth() <= 0)
														{
															System.out.println("//n-------------------------------------------------------------------------------------n//");
															System.out.println("Game: You have beaten the Goblin.");
															System.out.println("Game: You have completed the job.");
															System.out.println("Game: You got paid and decide to drink the reaminder of the day away.");
															System.out.println(" ");
															System.out.println("Game Over!!");
															System.out.println("Achievment get: Make it Rain");
															System.out.println("//n-------------------------------------------------------------------------------------n//");
														}
												}
										}
											
								}
							else if(decision4 == 2)
								{
									System.out.println("//n-------------------------------------------------------------------------------------n//");
									System.out.println("Game: You run from the Slime.");
									System.out.println("Achievment get: I don't know why I gave you the option");
									System.out.println("Game: I am dissapointed and you, so......imma just end this.");
									System.out.println("//n-------------------------------------------------------------------------------------n//");
								}
						}
					else if (decision3 == 2)
						{
							System.out.println("//n-------------------------------------------------------------------------------------n//");
							System.out.println("Game: You decide to do nothing and drink the rest of the day away.");
							System.out.println("Game Over!!");
							System.out.println("Achievement get: Fun Night");
							System.out.println("//n-------------------------------------------------------------------------------------n//");
						}
					
				}
			else if(decision1 == 2)
				{
					System.out.println("//n-------------------------------------------------------------------------------------n//");
					System.out.println("Game: You quit your adventure, and live a boring life");
					System.out.println("Game: Game Over!!");
					System.out.println("Achievement get: Why did I add this option?");
					System.out.println("//n-------------------------------------------------------------------------------------n//");
				}
			else if(decision1 == 3)
				{
					System.out.println("     ``      ``                  ``````                                                                                  \r\n" + 
							"                                                                                      ``          ````      ````    ``````                                                                              \r\n" + 
							"                                                                                  `       ``  ``                   `             `                                                                      \r\n" + 
							"                                                                                      ``          ``..//ssyyss/:.`` ``````                                                                              \r\n" + 
							"                                                                                      ```   ``  ..++yydmNNNNNNddhy/:`                                                                                   \r\n" + 
							"                                                                                               `//ddss++sshdddddhhddso:.`  ```                                                                          \r\n" + 
							"                                                                                      ``  ``...-sshhoo++hhmNmmdhhhysyyso:`` ``   `                                                                      \r\n" + 
							"                                                                                       ``.sydhyyhhhhddmmNNNNNNmmmmhhs+syo+-`  ```                                                                       \r\n" + 
							"                                                                                       `/+dhsshhssmmNNhhhhhhhhmmmmmmyoooydo:.`````                                                                      \r\n" + 
							"                                                                                       .so::.-//ooNNmmddddddmmmmddmNdho+ydyy/````                                                                       \r\n" + 
							"                                                                                  ``   .+/  ```.ooddyyhhhhNNmdsoyydddds+syhdo-.``                                                                       \r\n" + 
							"                                                                                  `    `::``   `:/hhssssoomNdh:.::+ohdsoosydyo/.``                                                                      \r\n" + 
							"                                                                                    `` `::..  `.:/ssooss++hdhh+/.`-:ymyooossyho/-``                                                                     \r\n" + 
							"                                                                                    `` `//::``::so//::///+oossyh-`..yNhsoo+/osss/``                                                                     \r\n" + 
							"                                                                                    ```-hy--::ooyy----..:://+ohh/:.`smhyso/---/s+:.                                                                     \r\n" + 
							"                                                                                     `.:ys.-osssss--::-...::++syyy:.shhhys/-.`-+oo/                                                                     \r\n" + 
							"                                                                                  `     `./+yyssys::--..``:://+ohds+syhdhy+-.`.:+y+``                                                                   \r\n" + 
							"                                                                                  `     `.syhyssss::..--``--::++syhhyyhhhy/.````:o/-.                                                                   \r\n" + 
							"                                                                                  ``    .-yyhyssss//----..--::/++oyyhhyyyy/.`   `-:/-`                                                                  \r\n" + 
							"                                                                                       `-:yyyyyyss++::--..::+osso+oshdhsyy/```  ``./-``  `                                                              \r\n" + 
							"                                                                                      ``-/yyssyyssoosssshhddmNdd+//+yhysss:````   `-.                                                                   \r\n" + 
							"                                                                                       `-:yyyyddmmMMNNNNNNNNNNmmso++syyho+-``                                                                           \r\n" + 
							"                                                                                        `-yhNNMMNNNNyyssoo++//////+ooosy/-`    ```                                                                      \r\n" + 
							"                                                                                    `````.yhNNmmddyy//::` ````..:://++oo/-.   ```                                                                       \r\n" + 
							"                                                                                        .-yyhyoossss//::` ..------//ydNMNNo.```                                                                         \r\n" + 
							"                                                                                    `   `.ysoshhyyyy++-.::----ooyyhdhhhhmMs:.                                                                           \r\n" + 
							"                                                                                        `-yyoossyyhhss--:://yhhdhhsssyyhhd+.`         ````                                                              \r\n" + 
							"                                                                                  ``  `.:/hhhhhhyyyyss:::://hdysoooosyyhso-                                                                             \r\n" + 
							"                                                                                     `:/sshdNNNNmmyyss++++sydmysssssyyyy+:.      ````                                                                   \r\n" + 
							"                                                                                  `.++oosyhdNNddmmNNhh++//syhho+oosssyss/-`            ````````                                                         \r\n" + 
							"                                                                                `.:+yyssyyyhmmhhddNNhhoo//yyhhsoyysosyyys+++oooo+/+++++++++++//--``                                                     \r\n" + 
							"                                                                               ``-oossssyyyhhdmmddddddhhoohhhhysyyhhddddhhhhhhyssoosooo+ooossssoo//..``                                                 \r\n" + 
							"                                                                               ``:yyyyhhhhhy+ohhhhhhmmddhhddmmhyhdddddyyyhyyssooooo++++//:::://++oo++::..                                               \r\n" + 
							"                                                                          `     `-ssyyhhddhy//++ssyyhhhhddNNNNmmddhhhhyysso++////////::/:--------:/++++++--    ``                                       \r\n" + 
							"                                                                                `./+yyhhyhhy--`.oommmmmmNNNNNmddhyyysssoooo++/////::::/+///:://::++++//++++::``                                         \r\n" + 
							"                                                                                 `.:yyysoshs````hhNNNNNNNNmmddyysssooo+++////////////++oooooossssysssoooo++oo-.` ``                                     \r\n" + 
							"                                                                             ``.---/ooooosys..::mmmmNNNNmdhhyysoooooo++++++///++osyhhddddmmmmmmmmmmmmmmddhhyyoo--``                                     \r\n" + 
							"                                                                         `.--://++oo++oshhddyyyhmmmmmmhhyyssooo+oosssoo+++oosyhddmmNNMMMMMMNNmmddmmMMNNmmmmmmmmso-`                                     \r\n" + 
							"                                                                       `.:+oossoooooossyNNNNNNmmhhddhhyyoooooooossssssssyyhdmNNNmmmNNMMMMNNNmhyssssMMddhhhhNNMMmd+:`                                    \r\n" + 
							"                                                                   ``.-:/ossssso+ooshdmmMMmmNmmdhhddhhssoossyyyyyyyyhhdmmNNMMNmdhsydmmmmmddddyy++++hhyyyyssddMMNNso.`                                   \r\n" + 
							"                                                                 `.-:++osssooooooshdNNMMNNmmddddddddhhyyyyhhhhhhhhdmNNMMMMNNmdhysosddmddhssyyys////ooyyoooossNMNNdd:``                                  \r\n" + 
							"                                                               .-/+osssssooooosyhdNNMMNNddhyyyyyyyyyhhhhddddddddmmNNMMMNMMNNdhyss+ymmmmdhsoooys////ooddoo++//mNmmMM/.`                                  \r\n" + 
							"                                                 ``        ``..osyhhhyssssssoydmNMMNNmmdssoooossyyyyssyyhhddmmmmNNNNNNNNNMNNdhyssoymmddddss+ohy//////ddyy++//yhhhmN/.`                                  \r\n" + 
							"                                                     ``    ``/ossyyyyssyhdmdhdmNMNNmdhyssooossssssssssssssyyhhddmmNNNNNNNNNNdysosyyyyyhmdoooossoo++++yyyyo+++syhdyy:``                                  \r\n" + 
							"                                                         ``.-oyssssyyyyyyhmmNNMNmmdhssoossssss++++++oooooossyyhdddmmNNMMNNmmhyhhhhdmmdmNd++//oshhhhddooddso//yhyyo+.`                                   \r\n" + 
							"                                                 ``      ..+osyssssyyhhhydNNMMNmhyssoooossssoo//////++oossssyyhhddmNmmNNNNdhhyyyhmNNmhhhhss/+oohhNNNNoommyy++mNhyo+.`                                   \r\n" + 
							"                                                 ``    ``//syssyyyyyyhddmNMNNmdhyyysooooo+++:::/++++++oossssyyhhmmNNNNNNmmhyyhsohNmyyoossys+ooosshyssoosshhyymNNNo/-.`                                  \r\n" + 
							"                                                       --osoooossyyyyhdmNNNmdhssssooosyysso+:::/++++++ooyyyyyyddmNNMNNdhmNdyysyyhmdhhyyyyss++++++::----//oshhhddd/-::.`                                 \r\n" + 
							"                                                    ```ooyysssssssyhdmNNMNmddy+++ossyydhhhssoooossoossyyhhddddmmNNNNNmhydmhssyhdyoo++///+++//----....``--++hhsosy. -:.`                                 \r\n" + 
							"                                                     ..hddddmddddmmNMMMMMmdhhyooossyhhddmdhhhhyyyyyyhhddddmmNNNNMMMMmddddmdhyso++oo++o+////----..``--``--sshdsooo. .-`                                  \r\n" + 
							"                                                       +odmmmmmNMMNNNMMMMNmmddddyo::::::-:+ommhhhhddddmmmmNMMMMMMMmdddddhhyso++++++o+//:::::::::://+/::++ssdmyyso:-`                                    \r\n" + 
							"                                                     ``  sydmddmmNMMMNNNNmdddddyo/----//:///ssdmMMNNMMNmMMMMMMddmNNNdhysssoo+///::::-..--::////////:://oohhhhoohh/:`                                    \r\n" + 
							"                                                   ``  --dmhydmNMMMMMNNmmdddmmdyo+::-:/+ssyyyymmddddddNNmmmmddNMMMmdhysoooo+//:::::--.--::/++////////oossNMddo+yh+/`                                    \r\n" + 
							"                                                     --hdyyNMNNNNNNMMMNmmdddmmmdysoosshhddhhyhddhhddmmddddmmMMNNmdyyoo++++++/////////:/++/+o+//++//oooossmmNNsoyyyh-                                    \r\n" + 
							"                                                 ``  :/ssddmmNNNNNNNMMMNmmdddmmmmhyyhdddhhhhmmmmmmNNddhho+syssyyssss++///////++++++++++oooooo/+++oossssooyyo+yh++yh-                                    \r\n" + 
							"                                                     ::dmNMmmNMMMNmNMMMNNmmdddmmmmddddhdddmNMNhhyyssyyyyddo+++/:/+++ooooo++/+++oooooossssssoooooossssssss//.`dm/:/+.                                    \r\n" + 
							"                                                   ``--//////::++yhmNMMNNmddhhddmddddhhhhdddhhoo----++//++sso+-.--//osyhhysooooooosyyyyyyyyssssssssooyyss++` mM/-/+.                                    \r\n" + 
							"                                                     --oso+++//::oydNNMMNmdhyyyyhhyyoo:::/++++ss--``--::::yyss//-.:/+oyhhhysssssssyhhhysyhysyhyssys//hhyy//``sy.`oy.                                    \r\n" + 
							"                                             ``  ``yyhhoo/:syddo+//osyyysyyyys+shysss+--``..:/yyyy::..:://oodmso:::/++shhhhhhhyyyyyhhhhhhhhhhhhooyy//yydd++--sy. +o-``                                  \r\n" + 
							"                                               ``ssyyyyo+-.yhNMddo+/:::////ossoossyyso/:``.-::ssddyy//::::oohhhhoo//++yhhhhhhhyyyhhhhyyhhddddssssyyo+++NN//..sy. :/..``                                 \r\n" + 
							"                                               ::dd++hhyy/:+ohddddds+:.-:--:/+oosssydho+//-://sssshhdd++////sydmyso+++syyyhhhhhhhdhhhyyhhdhyyhysshyso++NN-.``yd-`..```                                  \r\n" + 
							"                                         ``   `oohh++ddmmso//osyhdmdh+:-----:/+ohysydhyyoooossssyyyymmhh+///osdmhhyyoossyyhhyyyyyhhhhhhhhyysymdsshhssssyy` ``yd:.`  `                                   \r\n" + 
							"                                         ``  ``yyyyo+mmNNdhssoo++oosso+++///:::/osyyyydhssssssooyyyyhhddssoossdddddhysyyyyyysoosshhhhhhyyyyhhddssyyss++::  ``/+.```                                     \r\n" + 
							"                                            `.-hhhho+NNNNmmddyy+/:-://+++++oso++++oosyhyoossso++oosssshhhhsssshhddddhhhhyyyyssssyyhhhdhyhddhhddyyyyoo--``  ````  ``                                     \r\n" + 
							"                                           `.//ddmmyyNMNNhhmmdhss/:+ssooooosyyyyyyyysyhhooyyssoossyyssssyyhhsssshhddhhhhysyyysyyyyyddhddddhyyhhhhyy++                                                   \r\n" + 
							"                                          `--ssmmmmNNNNmdhymmhhsso+hNmddhhhhyyyhddmmddmdyyhhsyyyyyyyhhssyyddhhooyyddhhyyyyyhyyyyyyhdddddddhhhyhddhh..``                                                 \r\n" + 
							"                                         ..:/hhmmddNNddhyddmmhhsossmMNmmmmmmdddddmmNNNmmddddddddhhyymmddhhddmmssssyhhhyyhhddhyhdddddmNmhdddddyhhhoo  ``                                                 \r\n" + 
							"                                   `    `::++ddddhhMMhhyshhmmddsohdNMNNNMNNmmNNNNNNNNNNNNNNNNmmmmmmmmmmmmmmmNNhyoosyhdhhhdmmmdmmmmmmmmmddddddddso.`                                                     \r\n" + 
							"                                      `.-/+ooddddddNNhho+yhdmmmyshhmMNNNMNNNNNNNNNNNNNNNNNMMMMNNNNNNNNNNNNNNNMhysohddmmmmmmNmmmdmmNNmddddddyyhy-.                                                       \r\n" + 
							"                                      `//++oohhddmmNNyy+/yhmmNNhyyymNNNNNNNNNNNNNNNNmmmmNNNNMNNNNNNNNNNNNNMMMMmdddmNNNNMNNNmNNmhdmmmmmNNmso::--                                                         \r\n" + 
							"                                      .oooo++yyhhNNmmyyoohdmmNNhyysdNNNNNNmmNNNNmmmmmmmmmmNNNNNNNNNNMMMMMMMMNNNNNNMMNNMMNNNNNNmmmNNNNNNNh-.``  ``                                                       \r\n" + 
							"                                     `-ssso++ssyyNNddhhhhddddddhyysmMNNNNNNNNmmmmmmmmmmmmmNNNNNNMMNNNNNNNNMMNNNNMMMMMMMMMNMMNNNNMMMMNNmds                                                               \r\n" + 
							"                                    ``-ssysooyyyyddddmmmmhyysyyyyyymMMNNNNNNNmmddddmmmmmmmmmmmmmmmmmddhhddNNNNNNNNNNNNNNNNNNNNNMMNNNNMms+    ``                                                         \r\n" + 
							"                                     `.+oyysyhhhhhhddNNmmysoosssssymMMNNNNNNmmddddmdddddddmmmmddhhddhhyyhhNNmmNNddddddddmmmmmdmmmmNNNMmo/                                                               \r\n" + 
							"                                      `/+yyhhddhhyyddMMmmysssyysosymMNNNNNNNNmddddmdddddddmmmmddhhyyhhyyddNMNNNNddhhhhdddmdddhhhhhdmmNNdy                                                               \r\n" + 
							"                                      `-:ssddddhhddmmNNNNysoosyo+yhmNmmNNNNNMNmdhhhdNNmmmmNNNmhhyyhhyyyyyymNMMmmmNmmNNNMNNNMNNNNmddhddhy+                                                               \r\n" + 
							"                                  ```   `/+ddmmhhddmmNNNNdhssyhoohdmNmdddmNmddhhyhhdNNNmmmMNNNddhhssssyyhhNNMMmmmmmNNNNNNmNNNNNNNNNmmmh+:                                                               \r\n" + 
							"                                   `      `:/yhNNhhhhhhmmhhooyyo+hmdddhmNNNdyyyhhddmNNNNmmMMMMNNmmhhdddmmmNMNNmdddNNNNmmmmmNNNNNNNNNNNds+  ``                                                           \r\n" + 
							"                                             ..++yyyyyyhhyyooyyoohdhhddNMdyyyyhddddmNNNNmmNNNNNNNNNNNNNNmmmmmmdddmNNNNNNNNNNNNNNNNNMNNNNy                                                               \r\n" + 
							"                                 `       ``      ``..::++ooooss+/ydhhmNmdyoshhdhyyyhmmNNNNNNNNmmmmNNmmmmddmmmmmmmNNNMMMMMMNNNNNNNMMMNNNMh``                                                             \r\n" + 
							"                                           ``````      ````/+syyyhhhhmNdhddddhhyssosddNNNNNNNNNNmmmmmmmmmmNNNNNNNMMMNNNmmmNNNMMNNNmmmNNNmso``                                                           \r\n" + 
							"                                        ````     ``  ``    /+++oosyddmmmdmMmhhyyyysydmNNMMNNMNNNNNNNNNNNNNNNMMNNNNMMNmdhhhddNMNmdhhhdmNNNNd-.                                                           \r\n" + 
							"                                                           +o++osyymMNNNmdhysyddddhdmNMMMNNNNNNNNNNNmmNNNNmmmmmmmmNNNmdhhhhhdmddhyyhhhdNNNd-.                                                           \r\n" + 
							"                                                        `  +o+/osdmNNNNdhysssydddmNNMMMMMMNNmmmmddNNddNNNNmmNNmmddmNmmdhhhhhhddddhhhhhdmmmh-.                                                           \r\n" + 
							"                                                         ``+s++ssdmmmdhsossyyhdmNNNMMMNNMMMNmmmmddNNddNNNNmmNNmmddmmmmdhhhhyhhddddhhhhhddmh/:                                                           \r\n" + 
							"                                                         ..os++syhhyyysssyyhdmNNNNNNNNNNMMMNmmmmddNNddNNNNmdmmmmmmmdmmdhhhhyhhhddmdhhhhddddso``                                                         \r\n" + 
							"                                                         --os//syysyyyyyydmNNNNNNNNNNNNNMMNNmmmmddNNddNNNNddmmmmmmddmmdhddhhhhhhdmdhhhdddddhy..                                                         \r\n" + 
							"                                                         ::oo/:shyyyyhddmNNNMMMNNNNNNNmNNNNNmmmmddNNddmmNNdddmmmmmddmmdddddhddhhdddddhddddddh::                                                         \r\n" + 
							"                                                         :/+o/:shhhdmmNNNNNMMNNNNNNNNmmmNNNNmmmmmmNNddmmNNddddmmmddddddddddddddhhhdmdhhdddddho+``                                                       \r\n" + 
							"                                                         /++o//oshhmNNMMMMMMMNNNNNNNmmmmNNNNmmmmmmNNddmmmNddddmmddddddmmdhhddddhhhdmmdhhhddddhy-.                                                       \r\n" + 
							"                                                   ``    /+oo////ydNNMMMMNNMMMNNNNmmmmmNNNNNmmmmmmmmddddmmddddmmddddddmNdhhhhdddhhhmddddddddddh//                                                       \r\n" + 
							"                                                         /+////:-hNNMNNNNNNNMNNNNNNmmmddmmmmddmmmmmmhhddmmddhhdmdddddhmNdhhhhhdddhhddmddddddddhso``                                                     \r\n" + 
							"                               `                     ``  /+::/+//dMMMNNNNNMMMNNNmmmmdhyysssyhhmmddmmhhddmmmmhhddddddhhdmddhyhhhhhhhhdddddhhdddhhy:-                                                     \r\n" + 
							"                 `     `     ````              ``````````+o/://symNNNNNmmNNNMNNmmmmddhssoooshhmmddNNhhddmmmmhhddddddhhdddmdhhhhhhhhhhhhddhhddddhhoo                                                     \r\n" + 
							"                              ```....----::::::////++////os+/++hddddmdddddmmNmmmmmmmddhhhhhhddmmddNNhhddmmmmhhdddmddddhhdmdhhhhhhhyyysymdhhhhddhhdh``                                                   \r\n" + 
							"                            `.-/+ssssssssssssssyyyyddmmmdssooooyyyyhhdddddmmmmmmmmmmdddmNNmmddmmmmNNhhddmmmdhyhdmmdhhdhydmdhyyyyyyyssyhddddhhhhhhNm--                                                   \r\n" + 
							"                          `.:+smmNNmhoo::........::--/+ss/::-::oyhdddmmmNNNNNNmmNmmmddmmNNmmhdddmmNNyyddmmddhyhhmmhyhhyydmddhhhhhddddmmmmNmmmmmmmNNoo``                                                 \r\n" + 
							"                          .:+yyyyys/:``      ``----``../+::----shddddddmmNMMMNNNNmmmmmmNNNmmddmmmmNNyyddmmddyyhhmmddddddmNNNNNNNNNNNNNNmmNNNNNNNNMMdd..                                                 \r\n" + 
							"                         `.::/:--..      ``  ``--....--/+:::/--osyyyyhhddmNNMNNNNmmmNNNNNNmmddmmmmNNyyddmmddyyyydmNMMMMMNNNNNMNNNNNmmddyyddddmmmmNNMN--                                                 \r\n" + 
							"                   `               ```           ``  ..+o/::::-shdmmNNNNNNMNNNNNmmmNNNNNNNmmddmNNNNNyyddmmddyyyydmNMNNNNmmmmmNmmmNmddhhyyhhhhddddMMNN--                                                 \r\n" + 
							"                                                     ..++/://:-ydmNNNNNNNMMMMNNNNNNNNNNNNNmmmmmmNNNNhhddmmddysyyhdNMNmddddddddmmmmmhdddddhhyyddddMNss``                                                 \r\n" + 
							"                                                     ..++/://:-ydmmmNNNNNMMMMNNNNNNNNNMNNNmmmmmmNNNNhhddmmddyyyyhdNMNNmmmmmmddddmmmdhhhmdddhhhhmmmm--                                                   \r\n" + 
							"                                                     --++/://::yhdmmmNNNMMMMMNNNNNNNNNMNNNmmmmmmNNNNhhddmmmmyyyyhhNMNNNmNNmmdhhhdNNmdhhmmddhhyydd+/                                                     \r\n" + 
							"                                                     --++/:::::yhdmmmNNMMMMMNNNNNNNNNNMMNNmmmmmmNNNNyyddmmmmyyyyhhmNNNmmmmmmdhhydNmdhyhddhhddhdmd::                                                     \r\n" + 
							"                                                     ::++//:://yhddmmNNMMMMMNNNNNNNNNNMMNNmmmmmmNNNNyyddmmmmhyyyhhmNNmmdmmmmdhyyhmdhhyhhhhhhhhdmmss  ``                                                 \r\n" + 
							"                                                     //++////++ydddmmNNMMMMMNNNNNNMNNNMMNNmmmmmmNNmmyyhdmmmmhyyyhhmNNNmmmmmmdhyyyhdmmhhsyyyhhhhddmm  ````                                               \r\n" + 
							"                                                     /+++////+ohdddmmNNMMMMMNNNNNNNNNNMMMNmmmmmmNNmmsshdmmmmhyyyhhmNNNmmmmmddhhyhhdNmhhyyyhdddddmMN    ``     `                                         \r\n" + 
							"                                                     ++++++//oohdddmmNNMMMMMNNNNNNNNNNMMMNNmmmmmNmmmssddmNmmhyyyhhmNNNmmdddhhhhhhhdmmddmmddmmmmmmMN--        ``                                         \r\n" + 
							"                                                   ``+o++++//syddmmmmNNMMMMMNNNNNNNNMMMMMNmmmmmmNNmmyyddNNmmhyyyhhmNNNNNmdmmmdddddmNNmmmmmmmmmmdmNN//                                                   \r\n" + 
							"                                                   ``oo++++//yhddmmmNNNMMMMMNNNNNNNNMMNMMNmmmmmmNNmmyyddNNmmhyyyhhmNNNNNmmmNmmmmmmmNNmmmmddddhdddmm++                                                   \r\n" + 
							"                                                   ``os++++//hddmmmmNNNMMMMMNNNNNNNNMMNMMNmmmmmmNNmmyyddNNmmyyyyhhmNNMNNmmmmmmdddmmNNmmddyyyyyyhhddss``                                                 \r\n" + 
							"                                                   ..oo//++//dmmmmmNNNNMMMMNNNNNNNNNNNNNMNmmmmmmNNddyyddNNmmyyyyhhmmNMNmmmddddhhhddmmmmhhyyyyhhhhhhdd..                                                 \r\n" + 
							"                                                   --oo//++++mNmmmNNNNMMMMNNNNNNNNNNNNNNMNmmNNmNNNddyyddmNmmyyyyhhmmNMNmmmddddhyhhhddmdyyhhhhddddhhmm--                                                 \r\n" + 
							"                                                   ::oo//++++mMmmmNNNNMMMNNNNNNNNNNNNNNNMNNNNNNNNNddyyddmNmmhyyyhhmmNMNNNmmmmmdhhhhhdmdyyhhddmmddhhdd//                                                 \r\n" + 
							"                                                 ``++oo+/++oomMmmmNNNNNNNNNNNNNNMMMNNNNNMNmNNNNNNNhhyyddNNmmhyhhhhmmNNNNmmmNNNmddhhhdmdhhyhddmmhhhhddss``                                               \r\n" + 
							"                                                 ..syso+/++osmMmmNNNNNNNNNNNNNNNMMMMNNNNMNmmNNmmmmhhyyddNNmmhhhhddmmNNNmmdmNNNmmddhhhdddhyydddhyyhhddhh``      ``                                       \r\n" + 
							"                                                 ..yyoo//++syNMmmNNNNNNNNNNNNNNNMMMMMNNNMNmmmmmmmmhhyyddNNmmhhhhddmmNNmmddmmmmmmmddyhhdmdyyhhhhyyhhdddd..                                               \r\n" + 
							"                                                 ``ssoo////yhNMmmNNNNNNNNNNNNNNNNNMMMMNMMNmmmmNNmmhhhhhhNNmmhhhhhdmmNNmmmddmmmmmmmdhhhhmdhhyyhhhhddddmm::                                               \r\n" + 
							"                                                 ``ss++//::yhNMNNNNNNNNNNNNNNNNNNNNNMMMMMNmmmmNNNNddhhddNNmmhhhhddmmNNNmmdddddddddddhhhddddddddddmmddmmoo`                                              \r\n" + 
							"                                                 ``yy++//::hdNMMNMMMMNNNNNNNNNNNNNNNMMMMMNmmmmNNNNddhhddNNmmhyhhdddmNNNNNmmmdddddhdddddmmmmmmmmmmmmhhddhh``                                             \r\n" + 
							"                                                 ``yyo+////hdNMMMMMMNNNNNNNNNNNNNNNNMMMMMNNNmmNNNNddhhddNNmmyyhhdddmNNNNNNmmmdddddddmmmNNNNmmmmddhhhhddmm--                                             \r\n" + 
							"                                                 ..yyo+//++dmMMMMMMMNNNNNNNNNNNNNNNNMNNNNNNNNNNNNNddyyhhNNmdyyhdmmmmNNNNNmmmmmmmmmmdmmmNNNNmmhhhhyyhhddmm+/`                                            \r\n" + 
							"                                                 --yh++//++dmMMMMMMMNNNNNNNNNNNNNNNNMNNNNNNNNNNNNNddyyhhNNmdhyddmNmmNMNNNNNNmmmmmmddddddmNNmdyyyyhhhhddddss``                                           \r\n" + 
							"                                                 ::hh////++mNMMMMMMNNNNNNNNNNNNNNNNNMNNNNNmmmNNNNNddyyhhNNddyyddmmmmNMMNNNNNmmmdddhhhhhhdmmddyyhhddddddhhhh-.   `                                       \r\n" + 
							"                                                 //hh:://++NMMMMMMNNNNNNNNNNNNNNNNNNNNNNNNmmmmNNNNmmyyhhNNddyyhhdmmmNNNNNNmmmmddddhyyhhhhddddhhddmmmmmmhhdd/:` ``                                       \r\n" + 
							"                                                 ++ss////+oNMMMMMNNNNNNNNNNNmmmNNNNNNNNMMNmmmmNNmmmmhhyyNNmdhhhdmmmmNNNNNNNmmmdddmdhddhsyhdNmhhddmmddddddddss`                                          \r\n" + 
							"                                                 ooss////ooNMMMMMNNNNNmmmmmmmNNNNNNNNNNNMNNNNNNNmmmmhhhhNNddhhddmmmmNNNNNNmmmmmdmmmmmmdyyhdNmddddddddddmmdddd-`                                         \r\n" + 
							"                                                 sssy////ssNMMMMMNNNNNNNNNNNNNNNNNNNNNNMMNmmmNNNmmddhhhhNNddhhddmmmmNNNNNmmmmmmmmmmNmmdhhhdNNmmddddddddmmddNN/:`                                        \r\n" + 
							"                                                 ssss////yyNMMMMMNNNNNNNNNNNNNNNNNNNNNMMMNmmmmNNmmddhhhhNNddhhddmmmmmNNNNmmmmmmmmmmmmmdddhdmmNmhhhhhhddddmmNNys.                                        \r\n" + 
							"                                               ``yyss////hdNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMNmmmmNNmmddhhddmNmmhyddddmmmNNNNmmddddmmmmmdddddhdmmNmhhhdddddddmmNNhy-.                                       \r\n" + 
							"                                               ``yyss///:dmNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMNNNNNNNdhhhhhmmNNmmyyhddmmmmmNNNNmddddmmmdddddddddmmNmddddmmddNNddyy/:`                                        \r\n" + 
							"                                               ..hhss////mNMMMMMMNNNNmmmmmmmmmmmmNNNNNNNMNNNmmNNddddyyyymmddhhddmmmmmmNNNNmmmmmmmddddddddddmmNmmmmmddddddo+::`                                          \r\n" + 
							"                                              `..hhss+///NMMMMMMMNNNNmmmmmmmmmmmmNNNNNMMMNmmmmNNmmNN++..+osymNmmmmmmmmmNNNmmmmmmmddddddddddmmmmNNNNmmdd//``  ``                                         \r\n" + 
							"                                               --ddo+oo//NMMMMMo/yhmNNmmmmdddddmmmmNNNNNNNNNNNNNNMMM``  ``-:mNNNmmNNNmmmmmmNNNNmmmmddmmddddmmhhNNmmoo--``    ``                                         \r\n" + 
							"                                               ::hhoo//ooNMNms+.`ohmNmmmmmmmmmmmmmmmmmNNNNNNNNNNMMMM``  ``--dNNNmmNNNNmmmdmmmNNNmmmmmddddddmmmmmddh--        ``                                         \r\n" + 
							"                                               ::hhoooooomNo/.`  oymNNmmmNNNNNNNNNmNNNNNNNNNNNMMMMNN      `.ydmNmmNNNNNmmdddmNNNNmmmmmmmmmdddddhhss`                                                    \r\n" + 
							"                                               //hh++ooss++.`    /sdNNmmmmmmmmNNNNNNNNNNNNNNNNMMMMmm        +smNmmmmNNNNNmmmmmmNNmmmmmmddddmmdddd++  ``                                                 \r\n" + 
							"                                              `oodd//ooyy.`  ``  :+dNNmmmddddddmmmmmmmmmmmmmNNNNMMmm  ``    :/mNNmmmNNNMNNNNmmmmmmmmmmmmmmmNNmmNmoo                                                     \r\n" + 
							"                                              `sshh+/ooyy`       -/dMNNmmmmmddmdddmmmmmmmmmmNNNNMMNN..      ..hmNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmmmhy``                                                   \r\n" + 
							"                                              `yyyy++ss++``      -:hMNNNNNNNmmNmmmddddddmmmmmmNNNNMMoo        osmNNNmmmmmNNNNNNNNNNNmmmmdddhhdddddd::    ``                                             \r\n" + 
							"                                              `hhyyoooo-.` ``    -:hMNNNmmmmmmNmmmmmmmNNNNNNNNNNNNNNmm.`      :/dNNmmmNNNNNNNNmmmmmdddddhhhhhsshhddss``  ``                                             \r\n" + 
							"                                             ``ddssssoo``  ``    .-hMMNNNmmmmmmmmNNNMMNNMMNNMMMMNNNNMM--`     :/mMNNNNNNNNNNNNmmmddhhhhdhyyyyssssmmoo                                                   \r\n" + 
							"                                             `.mmssss++`         `.ymNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN--  ``  :/dNNNNNNNNNNmmmmddhhhyssysooosyyoshy++           `                                       \r\n" + 
							"                                             ..ddooss++`         ``+ymNNNNNNNNNNNNNmmmmmmmNNNNNNNNMMyy``  ``  ..+shmNNNNNmddhyyyyyyysooooo+++ooyy++ss``     `                                           \r\n" + 
							"                                             --ddooss//`          `/ohmmmmmmmmmmmNNNmmNNNNNNNNNNNNdd::        ````/odNNNmdhyysssssssssoooo+++++yyooyy//    ``                                           \r\n" + 
							"                                             ::ddooss::`           +syhhhhhdddddmmNmmmNNMMMMMNddso::``          ``..hMNNdhysyyysssssssssooooo++oohyooss``  ``  ``                                       \r\n" + 
							"                                            `//hhooss:-          ``odhyyyhhhhhhdddmmddmmMNNNNNss                ``  yNNNmdhyyyyssssssssoooo++++//yy++hh//                                               \r\n" + 
							"                                            `++hh++yy-.          .-ymhyyyhhhhhhhddhddddmMMNNMNhh````      ``        ohmNmmdhyyssssssssoooso++++++ooooyyyy``  ``  ``                                     \r\n" + 
							"                                            `oohh++yy..          :+ydhyyyhhhdhhhhhhdddmmNNmmNNNm--            ``    :+dMNmddyssysssssoossso++oooossyyssmm:-                                             \r\n" + 
							"                                            `oohy++yy.`          +syhhhyyyhhhhhhhhhhddddmmNNNNMN//             `    -:hMNNmdyoshyosysoossoossssoossyyssddo+`   ``                                       \r\n" + 
							"                                            `yyyy++ss``        `.oyyhyyyyhhhhhhhhhhhhdmmddNNNNMMyy``                .-yNNNmdyosyyssssssssssssyyyysshhyyhhss-.                                           \r\n" + 
							"                                           `.yyyy++ss`         .-shhyyyyyhhhhhhhyhhhhhddddNNNNMMhh..                ..smmNmmhyyysosssssssyyyyyyhhddmmhhyyhh:-                                           \r\n" + 
							"                                           `.yyyyoooo`         -:ydhyyyhhhhhddmddddddddddmNNNNNNmd--                ``ohmNNmdhhyyysssyyhhhhyhhhddddddddyydd/:`                                          \r\n" + 
							"                                           ..hhssoo++`        `.-hNdhhhdddddddmmmNNNNNmmmmNNNNNNmm--                ``/ohdNMNmmdddddhyssyhdddhhyyyysshhyyhh++` ``                                       \r\n" + 
							"                                           .-dhssoo//`         ``ohhhhhhhddddmmmNNMMMMNNNNNNNNmmNm::                    :ohNNNmdhyysyhdddhyssssssooooyyhhhhss` ``                                       \r\n" + 
							"                                           -:ddssoo::`           +sdmmmmdmNNMMMMMNNNNNMNNNNNNNmmNN::               `    -/hMNNNNmhhyyssosssyyssoo++++oohhhhhh`                                          \r\n" + 
							"                                          `::ddoooo::           `+syhhdhhhhdddddhhdddmMMNNmmmmmmNm--                    .-sNmmmdhysoosssooooooooo++//++yyhhhh.`   `                                     \r\n" + 
							"                                          `:/md++ss--          `.+ssossyhhhhhhdhhhhhhdMMNNmmmmNNmm--                    `.ommmdys+osoooosyyssoo++++//oohhhhhh-.                                         \r\n" + 
							"                                     ``   `++dhoooo--      ``  .-oysoossyyhhddhhhhddhdNNNNmmNNmmdd..                    ``+ddmmdy+ooooossyyysoo+oooyyssoohhhh:-`                                        \r\n" + 
							"                                     `    `oodh++oo..          :/sysossyyyhhhhhhhhddddNNNNmmNNmmdd..                     `+hmNmdyoossooooosssyyyyssooyyhhmmmm+/``                                       \r\n" + 
							"                                          `syhh++oo..          /+yyysyyhhhhdddddmmmmmmMNNNmmNNmmdh``                      /ydNNmdyyssosssyyyyssssssyhhhhhdddd+/`                                        \r\n" + 
							"                                          `yyhh++oo``          /oydhhhhhdddddddddmmNNNMMNNmmNNNmhy``                      ./ohdNmdhssyyyyssoossyyhhyyyyyyddddo+`                                        \r\n" + 
							"                                          .hhyyoo++`           :/syyyhhddmmmNNNNNNNNMMMMmmmmNNNmss                        ``-/yMmdhyysssshhhhhyyyyyssyyyyyyhho+`                                        \r\n" + 
							"                                         `.hhyyso++`           .-shhddddmmmmmmmNNmmmNNMNmmmNNNNN++                       `  `-sMNdhyyyhhhhhyyyyssssooooyhoodd+/`                                        \r\n" + 
							"                                         `-hhyyss++            ..oyhddddddddddddmdddmNNNmmmmNNNm--                       `  `.oMNmdddhyyyssssssoossoo//yy+/dm+/`                                        \r\n" + 
							"                                         .-hhyyss++            ..shddhhhddddhdddddhdmmNNNNmmmmmm``                           `+mmmmmdhysssssssooooo++oohh+/hh++`                                        \r\n" + 
							"                                        `-:dhssss//            .-ydddhhhhhdddddddhhdmmMNNNmmNmyy                             `/ydNNmmddyyssssoooooossssyyooyh+/``                                       \r\n" + 
							"                                        `:/dhooss::            --ydhyyyhhhdddmmmmdddmmMNNNmmNm++`                            `-+yMNmmdhyyysssssssyyssyyssyydd+/`                                        \r\n" + 
							"                                        `:/dhooss::            :/ydhhhhdddddmmmmdmmmmNNNNmmmNm::                           `  .:sNNNmhyssyyyyssyysssshhhhdddd+/`                                        \r\n" + 
							"                                        `/+hhooss--          ``/+ydhhhhddddmmmNmmNNNNNNNmmNmmd..                           `  `./yhNNdhyyyyssssyysyhhhhhhhhdd+/`                                        \r\n" + 
							"                                        `+ohhssys..          ``-:oshdhhhhdmmNNNNNNMMMNNNmNNmhy``                               `.-/yhmdhyyysyyyhhhhyyyyyyyydd+/`                                        \r\n" + 
							"                                        `oshhosss``            ``:+yddddhdmmmmddmmMMMNmmmmNmo+                                    `-+mddhyyyyhhyyyysssshhyydd+/`                                        \r\n" + 
							"                                        .ssyyooss``              :/ydddhhhhhhdddmmNNNNmmmmNm/:                          ``         `/NNmmhyssssssssooooyysshd+/`                                        \r\n" + 
							"                                       `.yyyyoooo``             `/oyhhhhhhhhhdddhdmNNNmmmmNm--                                      :dmmddhssssoo++////oosshho+`                                        \r\n" + 
							"                                       `-hhyyoo++``            `.oyhhhhhddddddmdhdmNNNmmmmNd..                                      :ddmmmdssoooo++++++oossyyoo` ``                                     \r\n" + 
							"                                       `-ddyyoo//              :/ydddhhdddmmmmdddmNNNNNmmmmh..                                      -ydMNddsooo++++++++ssooyyss.`                                       \r\n" + 
							"                                       `-ddssoo//          ``  -/yddddddmmNNNNNNNNNNNNNNmdhy..                                      -shNNhhss++////++ooyyyyhhdd-```                                     \r\n" + 
							"                                       `-ddssso::          ``  .-yddhhhddmmmmmmmmmmmNNNNNmhy``                                      `-/yhddhy++++ooyyyyyyyyssdd-`                                       \r\n" + 
							"                                       `-mdssso--              -:ydhhhyhhhhhhddddmmNNNmmmmNd..``                                      -syNmssoshdmmssoo++ooo+hd/:`                                      \r\n" + 
							"                                       `-ddssoo..            ``+shddhhhyyyhhhhddddmmNNNmddNm::                                        .oyNmyyhhdhssoo////++oohhys.`                                     \r\n" + 
							"                                       `-ddssoo``            ``oydmmmddddhhhhddddddmNNNNddmdys  ``                                    .sshhssooosssss//++++osyyhd/-`                                    \r\n" + 
							"                                       .-dhssoo        ``      :+hmmmmmmmmmdddhhhdNNNNmmNNmmdh``                                      .oymmmmyyooooss++++++ooyyddyy-                                    \r\n" + 
							"                                   `   .-dhsso+                -:ydmmmNNNNNmmddhhdmNMNmNMNys..``                                      -syNmhhdhyyyyoooo++++ooyyyydm-                                    \r\n" + 
							"                                   `   `-ddys:-    ``   `    `.shyyhhhhddmmNNNNmddmmNNNNMmo+                                         `-yhmmmmMMNNMMNNddys++ssyyyy-.``                                   \r\n" + 
							"                                   ``  `-dhso..          ``.-osdmhyhhhhhddddmmmmNNNNNNmmmdso                                         `:hdMMNmhhddddNNMMNNddyyssyy:-`                                    \r\n" + 
							"                                       `-dhso..  ``    --syhhddhhdddhhhhhhhhhddmNNmmmmddddhy``                                       `-syMNddosyyyysyhhmmmmNNmddh/:`                                    \r\n" + 
							"                                       `-hho+.`      ``ssmNNmmddddmddhhhhhyyyhddNmmmmmddmmhs..                                        ./oMNdhssssooooooooooyyhhddys.                                    \r\n" + 
							"                                       .:dh++``      .-hdNNNNNNmmmdddhhhyyyyhdmmNNNNNmmmmd//``                                        .+sMNhhysoo++++++++++++ooyyss-.`                                  \r\n" + 
							"                                      `.:dh+/    --++yydmmmmmNMNNNNmmdhyyyydmmNNNNMNNNmmNd``                                         `-symmhhyyssoooo++++++++++osss/-``                                 \r\n" + 
							"                                       .-yy::  ``yymmmmhhdmmmmNmmNMNNmddhddmNNNNNNNNNNmNMd                                          ``:yhmmNmddhyssssoooooo++++oosy/-.`                                 \r\n" + 
							"                                       `-yy//--//ddNNNNmmmmmmdddmmmNNNNNNNmNNNNNmNNNNmmNMd``                                        `-/hdNNMMNNNNmmyyssoooo++++ooyh:.`                                  \r\n" + 
							"                                      `-:yyossshhddmmNNNNNNNNmmmmmdmmmNNNNNmmmmmmmmmNNmNMd``                                        ./ohdNNmNNNNNNNmmddyyssoo++oodm:`                                   \r\n" + 
							"                                    `--:/sshhhhmmmmmmmmmmNNNNNNNNNNmmmmmmmmmmmmmmmmmmmmmhs``                                        .+oddmmmmmmmmmmNNNNNNddyyssssmN:                                    \r\n" + 
							"                                  `.:ys//sshhddddddddhhddmmNNNNNNNNNNNNNNmmmmmmmmmmmmNNd+/                                          `-+mmmmmmmmmmddddmmNNNNmdddhhmm-                                    \r\n" + 
							"                                 `.+sNd++ooyyhhssyyyyhhhhddmNNNNmNNNNNMMMMNNNNNNNNNNNNMd--  ``                                      `:oMNmmmmmmmmmmddddddmmmmmNdhmm-                                    \r\n" + 
							"                                 `:ddmdssoossyyoossyyhhddddNNNNNNNNMMMMMMMNNNNmmmmNmmmdy.`                                          .+sMNddmmddddmmddmmhhddddddhhmN-                                    \r\n" + 
							"                                `.+MMNmhyoshhhhyyhhddmmmmNNNMNNmmddddhhyyyssoo++++ooo+/:``                                         `-oymdhhhhyyssssyhddddmmddddddhy-                                    \r\n" + 
							"                                `.:ddddhhyyNNmmmmmmmmddhhhhhhysoo//::-..``          `                                      `     `./oddhyssssooooooooooddmmddmmmm+/`                                    \r\n" + 
							"                                 `.:://ysosyyssyyyyoo//--....````                   `                                      `   `.:+hhdhys++++++oooo++++hhhhhhddmm+:`                                    \r\n" + 
							"                                 `    `::--  ``                                                                      `        `./yyhhyyso++++++++++ooooyyhhdddddd/-`                                    \r\n" + 
							"                                      `:-``                                                                                   ./ohhhhhhhyss++//////++++oohhddddhh:.`                                    \r\n" + 
							"                                      `-.                                                                                  `  :syddddmmmdhyssoo++//++//ooyhddhh++`                                      \r\n" + 
							"                                       ..                                                                                 ````+dmNNmmNNNNmmddyyss++++//ooo+/:--`                                        \r\n" + 
							"                                       ``                                                                                     -osyhddmmNNNNmmddyyso//....    ``                                         \r\n" + 
							"                                                                                                                                 ```...--:::---.```              ``                                     \r\n" + 
							"                                                                                                                           ````          `````       ``    ``                                           \r\n" + 
							"                                                                                                                                 ``                  ``        ````                                     \r\n" + 
							"\r\n" + 
							"\r\n" + 
							"");
					System.out.println("Stats: (?) Hp //  (?) Damage");
					System.out.println(" ");
					
					System.out.println("//n-------------------------------------------------------------------------------------n//");
					System.out.println("Game: You initiate a battle with guard.");
					System.out.println("What would you like to do?");
					System.out.println(" ");
					System.out.println("1: Attack!");
					System.out.println("2: Run for your life");
					System.out.println(" ");
					System.out.println("What would you like to do?");
					System.out.println("//n-------------------------------------------------------------------------------------n//");
					
					int decision2 = myScanner.nextInt();
					
					if(decision2 == 1)
						{
							
							System.out.println("//n-------------------------------------------------------------------------------------n//");
							System.out.println("Game: You have dealt 1 Damage to guard.");
							System.out.println("Game: Guards turn");
							System.out.println("Game: Guard decides to attack.");
							System.out.println(chooseCharacter1.get(option).getHealth() - chooseCharacter2.get(0).getDamage());
							System.out.println("You have died!!");
							System.out.println("Game Over!!");
							System.out.println("Achievment get: Just....Why");
							System.out.println("//n-------------------------------------------------------------------------------------n//");
						}
					else if(decision2 == 2)
						{
							System.out.println("//n-------------------------------------------------------------------------------------n//");
							System.out.println("Game: You lost.");
							System.out.println("Game: you cry yourself to sleep that night.");
							System.out.println(" ");
							System.out.println("Achievment get: Wet Pillow");
							System.out.println("//n-------------------------------------------------------------------------------------n//");


						}
				}
		}

	}
