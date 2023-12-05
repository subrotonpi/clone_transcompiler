def import readline , out
import sys
class Main ( readline ) :
    def submit ( self ) :
        num = randint ( 0 , len ( readline ) )
        readline = readline ( )
        if num % 2 == 0 :
            out.write ( "%d " % num )
            for i in range ( len ( readline ) - 1 ) :
                out.write ( "%d " % num )
            out.write ( "\n" )
            return
        if num == 1 :
            outp = ( len ( readline ) + 1 ) // 2
            for i in range ( outp ) :
                out.write ( "1 " )
            out.write ( "\n" )
            return
        a = [ ]
        a.append ( ( num + 1 ) // 2 )
        now_len = len ( readline )
        decr = len ( readline ) // 2
        while decr > 0 :
            if now_len == len ( readline ) :
                if readline [ - 1 ] - 1 >= decr :
                    readline [ - 1 ] -= decr
                    break
                now_len -= 1
                decr -= readline [ - 1 ]
            else :
                decr -= 1
                if readline [ - 1 ] == 1 :
                    now_len -= 1
                else :
                    readline [ - 1 ] -= 1
                    for i in range ( now_len , len ( readline ) ) :
                        readline [ i ] = num
                    now_len = len ( readline )
        for i in range ( now_len ) :
            out.write ( "%d " % a [ i ] )
        out.write ( "\n" )
    def pre_calc ( self ) :
        pass
    def stress ( self ) :
        pass
    def test ( self ) :
        pass
    class Main ( readline ) :
        def __init__ ( self ) :
            readline.__init__ ( self )
            self.stdin = readline
            self.stdout = sys.stdout
            self.stdout.readline = sys.stdout
            self.pre_calc ( )
            self.submit ( )
            self.stdout.close ( )
    rng = Random ( )
    def rand ( self , l = 0 , r = 0 ) :
        return l + rng ( self.r - l + 1 )
