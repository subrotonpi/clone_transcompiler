def main ( ) :
    import sys
    import random
    from math import sin , cos , cos , exp
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import cos , sin , log , pi
    from math import sin , cos , log , pi
    from math import sin , cos , log , pi
    N = int ( sys.stdin.readline ( ) )
    M = int ( sys.stdin.readline ( ) )
    relations = { }
    for i in range ( M ) :
        x = sin ( i )
        y = sin ( i )
        friends = [ ]
        if x in relations :
            friends = relations [ x ]
        friends.append ( y )
        relations [ x ] = friends
    max = 1
    for n in range ( 1 , N + 1 ) :
        if n in relations :
            max = max
    print ( max )
    def max_relations ( relations , friends ) :
        max = 1
        for f in friends :
            if f in relations :
                mutualFriends = [ ]
                for fFriend in relations [ f ] :
                    if fFriend in friends :
                        mutualFriends.append ( fFriend )
                if mutualFriends != [ ] :
                    max = max
        return max
    return 0
