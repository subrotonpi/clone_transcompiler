def import sys
class Main ( object ) :
    def min ( self , a , b ) :
        return a if a < b else b
    INF = sys.maxsize / 4
    def main ( self ) :
        with open ( self.filename ) as f :
            N = int ( f.read ( ) )
    dp = [ 0 ] * 100010
    for n in range ( 1 , len ( dp ) ) :
        dp [ n ] = INF
        power = 1
        while power <= n :
            dp [ n ] = min ( dp [ n ] , 1 + dp [ n - power ] )
            power *= 6
        power = 1
        while power <= n :
            dp [ n ] = min ( dp [ n ] , 1 + dp [ n - power ] )
            power *= 9
    print ( dp [ N ] )
