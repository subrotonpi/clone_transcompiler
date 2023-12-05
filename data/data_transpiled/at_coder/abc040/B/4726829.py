def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.reader = sys.stdin
            self.A = self.A
    base = get_max_squea_base ( A )
    min = A - int ( math.pow ( base , 2 ) )
    if min > 0 :
        for i in range ( base , 0 , - 1 ) :
            remain = A - int ( math.pow ( i , 2 ) )
            tmp = 0
            while i <= remain :
                remain -= i
                tmp += 1
            if remain + tmp < min :
                min = remain + tmp
    print ( min )
    sys.stdin.close ( )
