def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = _main.sc
        s = sc.split ( )
        N = int ( s [ 0 ] )
        A = int ( s [ 1 ] )
        B = int ( s [ 2 ] )
        count = 0
        for t in sc.split ( ) :
            M = int ( t [ 1 ] )
            if t [ 0 ] == "East" :
                if M < A :
                    count += A
                elif M > B :
                    count += B
                else :
                    count += M
            else :
                if M < A :
                    count -= A
                elif M > B :
                    count -= B
                else :
                    count -= M
        if count == 0 :
            print ( 0 )
        elif count > 0 :
            print ( "East %d" % abs ( count ) )
        else :
            print ( "West %d" % abs ( count ) )
