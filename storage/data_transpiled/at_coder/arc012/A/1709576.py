def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            map = { 'Saturday' : 0 , 'Sunday' : 0 , 'Monday' : 5 , 'Tuesday' : 4 , 'Wednesday' : 3 , 'Thursday' : 2 , 'Friday' : 1 }
            day = sc.readline ( )
            print ( map [ day ] )
