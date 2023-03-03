def import sys , inf
class Main ( object ) :
    def __init__ ( self ) :
        self.inf = inf
    def __call__ ( self , * args ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        S = sc.split ( )
        s = list ( S )
        back_rev = s.reverse ( ) [ : n ]
        front = S [ : n ]
        back_dic = { }
        for cur , remain in get_sub ( back_rev , n ) :
            if cur not in back_dic :
                to_add = { remain : 1 }
                back_dic [ cur ] = to_add
            else :
                to_modify = back_dic [ cur ]
                now = to_modify.get ( remain , None ) + 1
                to_modify [ remain ] = now
        cnt = 0
        for red_front , blue_end in get_sub ( front , n ) :
            if red_front not in back_dic :
                continue
            to_check = back_dic [ red_front ]
            cnt += to_check.get ( blue_end , None )
        print ( cnt )
    def get_sub ( self , s , idx ) :
        s = [ ]
        for c in s :
            if idx & ( 1 << i ) :
                s.append ( c )
        return s
    def get_sub ( self , s , idx ) :
        s = [ ]
        for c in s :
            if idx & ( 1 << i ) :
                s.append ( c )
        return s
    def get_sub ( self , s , idx ) :
        s = [ ]
        for c in s :
            if idx & ( 1 << i ) :
                s.append ( c )
        return s
