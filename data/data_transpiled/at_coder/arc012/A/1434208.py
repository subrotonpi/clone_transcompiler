def main ( ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    d = { 'Sunday' : 0 , 'Saturday' : 0 , 'Friday' : 1 , 'Thursday' : 2 , 'Wednesday' : 3 , 'Tuesday' : 4 , 'Monday' : 5 }
    ans = sc.next ( )
    print ( d [ ans ] - 0 )
