def main ( ) :
    import os
    from time import sleep
    from os.path import join
    from os import environ
    from os.path import join
    from os import environ
    from os.path import join
    from os import environ
    day = environ [ 'MONDAY' ]
    d = { 'Monday' : 5 , 'Tuesday' : 4 , 'Wednesday' : 3 , 'Thursday' : 2 , 'Friday' : 1 , 'Saturday' : 0 , 'Sunday' : 0 }
    for ans in d :
        if day == ans :
            print ( d [ ans ] )
