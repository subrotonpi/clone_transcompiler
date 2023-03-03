def _edit_honsuu ( n , a_set , start_val , honsuu_dict ) :
    import collections
    import random
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    class Main ( object ) :
        def __init__ ( self ) :
            self.honsuu = [ 0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 ]
        def __init__ ( self , n , total_ketasuu , a_set , start_val , honsuu_dict , ketasuu ) :
            for i in range ( start_val ) :
                if i not in self.honsuu :
                    continue
                if self.honsuu [ i ] * self.total_ketasuu == n :
                    self.zan_honsuu [ i ] += 1
                    return True
        def __init__ ( self , zan_honsuu , a_set , i , honsuu_dict ) :
            self.zan_honsuu [ i ] += 1
            return True
    def main ( self ) :
        honsuu_dict = defaultdict ( int )
        sc = string.split ( string.strip ( "\n" ) )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        a_set = set ( )
        for i in range ( m ) :
            ai = sc.__next__ ( )
            a_set.add ( ai )
            honsuu_dict [ self.honsuu [ ai ] ] += 0
        sc.close ( )
        x = honsuu_dict.keys ( )
        self.edit_morsuu ( n , x , 0 , honsuu_dict )
        total_ketasuu = 0
        for val in honsuu_dict.values ( ) :
            total_ketasuu += val
        ketasuu = [ ]
        self.edit_morsuu ( n , x , 0 , honsuu_dict )
        for i in range ( 9 , 1 , - 1 ) :
            for j in ketasuu :
                print ( i , end = ' ' )
        print ( )
    return False
