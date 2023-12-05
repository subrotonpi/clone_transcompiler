def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sys.stdout.write ( "\n" )
            sys.stdout.write ( "\n" )
    reader = open ( "/proc/stations/" , "r" )
    S = reader.read ( )
    reader.close ( )
    list = [ ]
    count = 1
    while S not in list :
        list.append ( S )
        if S % 2 == 0 :
            S /= 2
        else :
            S = 3 * S + 1
        count += 1
    sys.stdout.write ( "%d" % count )
