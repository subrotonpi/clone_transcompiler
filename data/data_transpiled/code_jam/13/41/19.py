def import _readline
import sys
import time
import time
import sys
mod = 1000002013
def solve ( ) :
    n , m = select.select ( [ sys.stdin ] , [ ] , [ ] , 0 )
    from time , to , count = select.select ( [ sys.stdin ] , [ ] , [ ] , 0 )
    init_ans = 0
    events = [ ]
    for i in range ( m ) :
        try :
            from readline.stdin.readline ( )
        except IOError :
            pass
    def next ( ) :
        while not readline.is_eof ( ) :
            try :
                readline.stdin.readline ( )
            except IOError :
                pass
        return int ( readline.readline ( ) )
    def next ( ) :
        return long ( readline.readline ( ) )
    def advance ( ) :
        while not readline.is_eof ( ) :
            try :
                readline.stdin.readline ( )
            except IOError :
                pass
        return next ( )
    def next ( ) :
        try :
            from readline.stdin.readline ( )
        except IOError :
            pass
        while not readline.is_eof ( ) :
            readline.read_line ( )
    def advance ( ) :
        try :
            from readline.stdin.readline ( )
        except IOError :
            pass
        return next ( )
    def compare ( x , type ) :
        t1 = next ( )
        cnt = min ( [ x for x in top if x != type ] )
        top [ "count" ] -= cnt
        e [ "count" ] -= cnt
        if not top :
            del stack [ - 1 ]
        sys.stderr.write ( "%d %d %d\n" % ( e [ "x" ] , top [ "count" ] , cnt ) )
        dist = e [ "x" ] - top [ "x" ]
        cost = ( dist * ( dist + 1 ) ) % mod
        if type == 1 :
            return t1
        else :
            return t2
    return next ( )
