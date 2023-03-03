def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        dict = { }
        for s in sc.readlines ( ) :
            if dict.get ( s ) is None :
                dict [ s ] = 1
            else :
                cnt = dict [ s ]
                dict [ s ] = cnt + 1
    max = 0
    ans = ''
    for key , value in dict.items ( ) :
        if max < value :
            max = value
            ans = key
    print ( ans )
