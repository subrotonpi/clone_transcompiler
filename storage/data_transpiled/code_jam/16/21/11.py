def _ ( ) : return int ( sys.stdin.readline ( ) )
def get_ins ( f ) :
    words = f.readline ( ).split ( )
    ret = [ ]
    for word in words :
        ret.append ( int ( word ) )
    return ret
NUM = [ 'ZERO' , 'ONE' , 'TWO' , 'THREE' , 'FOUR' , 'FIVE' , 'SIX' , 'SEVEN' , 'EIGHT' , 'NINE' ]
def diff ( sig , pos , neg ) :
    sum = 0
    for c in pos :
        sum += sig [ c - 'A' ]
    for c in neg :
        sum -= sig [ c - 'A' ]
    return sum
def compute ( sig ) :
    s = [ diff ( sig , 'Z' , '' ) , diff ( sig , 'O' , 'ZWU' ) , diff ( sig , 'W' , '' ) , diff ( sig , 'H' , 'G' ) , diff ( sig , 'U' , '' ) , diff ( sig , 'F' , 'U' ) , diff ( sig , 'X' , '' ) , diff ( sig , 'S' , 'X' ) , diff ( sig , 'G' , '' ) , diff ( sig , 'IU' , 'FXG' ) , ]
    s = [ ]
    for d in range ( 10 ) :
        while s [ d ] :
            s.append ( d )
    return ''.join ( s )
def run ( args ) :
    with open ( args.input , 'r' ) as f :
        with open ( args.output + '.out' , 'w' ) as out :
            T = get_ins ( f )
            for t in range ( 1 , T + 1 ) :
                s = f.read ( )
                sig = [ ]
                for c in s :
                    sig.append ( c - 'A' )
                out.write ( "Case #%d: %s\n" % ( t , compute ( sig ) ) )
