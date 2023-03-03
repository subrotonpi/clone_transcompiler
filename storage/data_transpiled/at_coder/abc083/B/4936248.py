def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , a , b = [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
    try :
        with open ( "/proc/cpuinfo" , "r" ) as sc :
            n , a , b = [ int ( x ) for x in sc.readlines ( ) ]
        total = 0
        for i in range ( 1 , n + 1 ) :
            sum = i / 10000 + ( i % 10000 ) / 1000 + ( i % 1000 ) / 100 + ( i % 100 ) / 10 + ( i % 10 )
            if a <= sum <= b :
                total += i
        print ( total )
    except KeyboardInterrupt :
        pass
