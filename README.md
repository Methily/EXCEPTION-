# EXCEPTION-

THIS CODE PERFORMS THE EXCPETION METHOD USING JAVA. 
main part -   
---------------------------------------------------------------------------------------------------------
throwCheckedException();
            throw new CustomException("Custom Exception: This is a checked exception.");
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, whether an exception is caught or not.");
            scanner.close();
---------------------------------------------------------------------------------------------------------
this is where the exception is checked.
      
