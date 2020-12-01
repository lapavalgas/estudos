
https://www.coursera.org/learn/object-oriented-design/peer/e98J9/capstone-assignment-1-4-update-the-application

Now that you have become more familiar with this application, it’s time to add some new functionality.

In this assignment you will update the application to implement this new functionality using the updated UML class diagram as a guide.

Review criteriamenos 
You will be graded on your understanding of the application code and design, your ability to translate from a UML class diagram to java code, and the correctness of your code.

Step-By-Step Assignment Instructionsmenos 
Setup instructions

Use this tutorial as your guide: Peer Review 4 Tutorial

The tutorial will begin by giving you the option to pick a code base:

Option 1: starter code base (recommended especially for those without Android programming experience -- you will only have to follow steps 1, 18, 19, and 20 of the tutorial)

SharingApp_contacts_starter.zip
Option 2: items only code base (you will have to follow all steps 1-20 of the tutorial)

SharingApp_items_only.zip
Use the following updated UML class diagram to assist you with your understanding and implementation:

UML Class Diagram Contacts.png
To help clarify what is expected in this version of the app, please view the updated user stories:

User Stories with Contacts.pdf
Arquivo PDF
About the application

This version of the app should accommodate the new contacts feature. In particular:

ContactsActivity should be accessible from the MainActivity.
menu.png
contacts_menu_item.png
ContactsActivity should be implemented as a ListView.
An owner should now be able to add a potential borrower (a contact) to their contacts. Each contact must have a unique username and an email.
ContactsActivity.png
AddContactActivity.png
An owner can edit or delete a contact, but not if the contact is currently borrowing an item, i.e. the contact is a borrower.
EditContactActivity.png
Owners are now required to select a contact to be the borrower of an item when changing the status of an item from “Available” to “Borrowed”. That is, it is no longer sufficient to enter the borrower’s username as a string -- now the borrower must be picked from the owner’s list of contacts.
EditItemActivity_available.png
EditItemActivity_select_borrower.png
EditItemActivity_borrowed.png