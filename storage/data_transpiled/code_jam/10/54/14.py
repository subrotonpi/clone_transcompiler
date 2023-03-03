def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.__dict__ [ '__init__' ] = { }
    mod = 1000000007
    memo = { }
    def create ( ) :
        for i in range ( 102 ) :
            for j in range ( 11 ) :
                for k in range ( 102 ) :
                    memo [ i ] [ j ] [ k ] = { }
        def calc ( num , base , mask , last ) :
            if not num :
                return 1
            if mask in memo [ num ] [ base ] [ last ] :
                return ( memo [ num ] [ base ] [ last ] [ mask ] , )
            res = 0
            loop :
            for i in range ( 1 , min ( last - 1 , num ) + 1 ) :
                digs = str ( i , base )
                next = mask [ : ]
                for j in range ( len ( digs ) ) :
                    if mask [ j ] & ( 1 << int ( digs [ - j - 1 ] - '0' ) ) :
                        continue loop
                    else :
                        next [ j ] |= ( 1 << int ( digs [ - j - 1 ] - '0' ) )
                res = ( res + calc ( num - i , base , next , i ) ) % mod
            memo [ num ] [ base ] [ last ] [ mask ] = ( res , )
            return res
    def main ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            t = f.readline ( ).strip ( )
            create ( )
            for tt in range ( 1 , t + 1 ) :
                n , b = struct.unpack ( '>I' , f.read ( 8 ) )
                mask = struct.unpack ( '>I' , f.read ( 8 ) )
                print ( 'Case #%d: %d' % ( tt , calc ( n , b , mask , n + 1 ) ) )
