def _import ( ) :
    import sys
    import os
    import math
    import re
    import os
    import sys
    import os
    import sys
    import os
    import re
    import sys
    class B_small ( object ) :
        def __init__ ( self ) :
            self.__dict__ [ '__dict__' ] = { }
        def __repr__ ( self ) :
            return 'Case #%d: %s\n' % ( self.casenum , self.casenum )
    def debug ( * arr ) :
        print ( " ".join ( arr ) )
    line = sys.stdin.readline ( )
    line = line.rstrip ( )
    line = line.split ( )
    case_count = int ( line [ 0 ] )
    for case_num in range ( 1 , case_count + 1 ) :
        ans = None
        line = sys.stdin.readline ( )
        line = line.rstrip ( )
        m = [ ]
        r = [ ]
        for i in range ( 26 ) :
            [ m [ i ] , r [ i ] ] = - 1
        c = int ( line [ 1 ] )
        for s in line [ 2 : ] :
            m [ s [ 1 ] - 'A' ] [ s [ 0 ] - 'A' ] = m [ s [ 0 ] - 'A' ] [ s [ 1 ] - 'A' ]
        d = int ( line [ 3 ] )
        for s in line [ 4 : ] :
            r [ s [ 1 ] - 'A' ] [ s [ 0 ] - 'A' ] = r [ s [ 0 ] - 'A' ] [ s [ 1 ] - 'A' ]
        n = int ( line [ 4 ] )
        input = line [ 5 : ]
        list = [ ]
        for i in range ( n ) :
            now = input [ i ]
            if not list :
                list.append ( now )
            else :
                last = list [ - 1 ]
                list.append ( ( last , ) + 'A' )
        if list :
            list.append ( now )
    return B_small ( list )
