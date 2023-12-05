def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( ).strip ( )
        b = sc.readline ( ).strip ( )
        TopCoDeer = b
        if a == 'D' :
            if b == 'H' :
                TopCoDeer = 'D'
            else :
                TopCoDeer = 'H'
        sys.stdout.write ( TopCoDeer )
