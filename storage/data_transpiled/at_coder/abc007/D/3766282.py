def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sa = sa
            self.s = ( sa - 1 ) + ""
            self.t = ( sa - 1 )
            self.S8 = ""
            self.T8 = ""
            ary = [ 0 , 1 , 2 , 3 , 3 , 4 , 5 , 6 , 7 , 7 ]
            s849 = False
            t849 = False
            for i in s :
                if not s849 :
                    if i - 48 in [ 4 , 9 ] :
                        s849 = True
                        S8 = S8 + "%s" % ary [ i - 49 ]
                    else :
                        S8 = S8 + "%s" % ary [ i - 48 ]
                else :
                    S8 = S8 + "%s" % ary [ i - 49 ]
            for i in t :
                if not t849 :
                    if i - 48 in [ 4 , 9 ] :
                        t849 = True
                        T8 = T8 + "%s" % ary [ i - 49 ]
                    else :
                        T8 = T8 + "%s" % ary [ i - 48 ]
                else :
                    T8 = T8 + "7"
    decS8 = long ( S8 , 8 )
    decT8 = long ( T8 , 8 )
    raw_T8 = long ( t )
    print ( long ( ( raw_T8 - sa + 1 ) - ( decT8 - decS8 ) ) )
