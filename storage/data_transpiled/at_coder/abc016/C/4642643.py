def import sys , out
import os
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.readline ( ).rstrip ( )
        M = sys.stdin.readline ( ).rstrip ( )
        relations = { }
        for i in range ( M ) :
            A = sys.stdin.readline ( ).rstrip ( )
            B = sys.stdin.readline ( ).rstrip ( )
            self._add_relations ( A , B , relations )
            self._add_relations ( B , A , relations )
        for i in range ( 1 , N + 1 ) :
            friends_of_friend = set ( )
            if i in relations :
                for f in relations [ i ] :
                    if f in relations [ f ] :
                        for ff in relations [ f ] :
                            if i == ff or ff in relations [ i ] :
                                continue
                            friends_of_friend.add ( ff )
            out.write ( "%d\n" % len ( friends_of_friend ) )
    def _add_relations ( A , B , relations ) :
        list = [ ]
        if A in relations :
            list = relations [ A ]
        list.append ( B )
        relations [ A ] = list
