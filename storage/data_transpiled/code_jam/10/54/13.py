def main ( ) :
    import sys
    def cuenta ( numero , base , ultimo , vistos ) :
        if numero == 0 : return 1
        if numero < 0 : return 0
        if vistos in dp [ numero ] [ base ] [ ultimo ] : return dp [ numero ] [ base ] [ ultimo ] [ vistos ]
        ret = 0
        for x in range ( 1 , ultimo ) :
            numerote = str ( x , base ).split ( '-' )
            sig = vistos [ : ]
            sirve = True
            for j in range ( len ( numerote ) ) :
                if vistos [ j ] & ( 1 << ( numerote [ - j - 1 ] - '0' ) ) :
                    sirve = False
                else :
                    sig [ j ] |= ( 1 << ( numerote [ - j - 1 ] - '0' ) )
            if not sirve : continue
            ret += cuenta ( numero - x , base , x , sig )
            ret = ret % modulo
        dp [ numero ] [ base ] [ ultimo ] [ vistos ] = ( ret , )
        return ret
    dp = { }
    def inicializa ( ) :
        with open ( '/proc/input.txt' , 'r' ) as f :
            t = int ( f.read ( ) )
            for caso in range ( 1 , t + 1 ) :
                n = int ( f.read ( ) )
                base = int ( f.read ( ) )
                mascara = [ 0 ] * 8
                mascara [ : ] = [ ]
                print ( "Case #%d: %s" % ( caso , cuenta ( n , base , n + 1 , mascara ) ) )
    def inicializa ( ) :
        for i in range ( 102 ) :
            for j in range ( 11 ) :
                for k in range ( 102 ) :
                    dp [ i ] [ j ] = { }
                    dp [ i ] [ j ] [ k ] = { }
                    dp [ i ] [ j ] [ k ] = { }
                    dp [ i ] [ k ] [ k ] = { }
    inic@@