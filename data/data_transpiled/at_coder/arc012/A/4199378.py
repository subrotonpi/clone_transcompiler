def main ( ) :
    import os
    from time import sleep
    sc = Scanner ( )
    set = { 'Sunday' : 0 , 'Monday' : 5 , 'Tuesday' : 4 , 'Wednesday' : 3 , 'Thursday' : 2 , 'Friday' : 1 , 'Saturday' : 0 }
    day = sc.next ( )
    print ( set [ day ] )
