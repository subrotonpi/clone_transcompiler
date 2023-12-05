def _ _ main _ _ ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import time
def get_int ( ) : return int ( readline.readline ( ) )
def get_ins ( ) :
    s = readline.readline ( ).split ( )
    r = [ int ( i ) for i in s ]
    return r
base = 9
moves = ( - 9 , - 8 , - 7 , - 1 , 1 , 7 , 8 , 9 )
def map ( x , y ) : return base + x + 8 * y
def win ( k , board ) :
    key = "%d %d" % ( k , board )
    if hm.get ( key ) : return hm [ key ]
    iswin = False
    nb = board | ( 1 << k )
    for i , d in enumerate ( moves ) :
        if ( ( board >> ( d + k ) ) & 1 ) == 0 :
            if not win ( k + d , nb ) :
                iswin = True
    hm [ key ] = iswin
    return iswin
def docase ( ) :
    hm = { }
    v = get_ins ( )
    R , C = v
    board = - 1
    king = 0
    for i in range ( R ) :
        s = readline.readline ( )
        for j in range ( C ) :
            c = s [ j ]
            if c == "K" :
                king = map ( i , j )
            elif c == "." :
                board &= ~ ( 1 << map ( i , j ) )
    if win ( king , board ) : return "A"
    else : return "B"
def main ( ) :
    lim = get_int ( )
    for c in range ( 1 , lim + 1 ) :
        r = docase ( )
        print ( "Case #%d: %s" % ( c , r ) )
