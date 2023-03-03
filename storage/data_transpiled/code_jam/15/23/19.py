def pyopenfile ( ) : return pyopenfile ( )
def run_cases ( ) : return pyopenfile ( )
def debug ( s , * args ) :
    sys.stderr.write ( "DEBUG: %s\n" % s )
def run_cases ( ) :
    try :
        cases = get_int ( )
        for c in range ( 1 , cases ) :
            try :
                answer = Solver ( c ).solve ( )
                s = "Case #%d: %s" % ( c , answer )
                if out != sys.stdout :
                    sys.stdout.write ( s )
    finally :
        debug ( "done with all!" )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    while True :
        return readline ( )
def readline ( ) :
    t = float ( )
    for hiker in readline ( ) :
        t1 = ( 360 - hiker.h ) / hiker.v
        t = min ( t1 , t )
    for hiker in readline ( ) :
        hiker.h += hiker.v * t
    for i in range ( len ( hikers ) - 1 , - 1 , - 1 ) :
        hiker = hikers [ i ]
        if hiker.h >= 360 :
            hiker.h = hiker.h
            hiker.v = hiker.v
    readline ( )
    readline ( )
def count_lappers ( hiker ) :
    count = 0
    for lapper in readline ( ) :
        count += ( lapper.h - 360 ) / 360
    return count
def readline ( ) :
    return ""
def readline ( ) :
    while True :
        return readline ( )
return readline
