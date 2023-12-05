def _ _ main _ _ ( arg ) :
    from itertools import repeat
    class Alpha ( object ) :
        def __init__ ( self , * args ) :
            self.args = args
            self.tcc = int ( self.args [ 0 ] )
            for tci in range ( 1 , tcc + 1 ) :
                print ( "Case #%d:" % tci , end = ' ' )
                sys.stderr.write ( "\n" )
            self.poly = self.args [ 1 ].split ( "+" )
            self.k = int ( self.args [ 0 ] )
            self.d = int ( self.args [ 1 ] )
            self.sdict = [ ]
            for i in range ( 0 , 26 ) : self.sdict.append ( self.args [ 1 ] )
            self.dict = [ ]
            for i in range ( 0 , 26 ) : self.dict.append ( self.word_to_arr ( self.dict [ i ] ) )
            if self.k >= 1 :
                ans = 0
                for i1 in range ( 0 , d ) :
                    comb = self.combine ( self.dict [ i1 ] )
                    ans = ( ans + score ( self.poly , comb ) ) % 10009
                print ( " " , ans )
            if self.k >= 2 :
                ans = 0
                for i1 in range ( 0 , d ) :
                    for i2 in range ( 0 , d ) :
                        for i3 in range ( 0 , d ) :
                            for i4 in range ( 0 , d ) :
                                for i5 in range ( 0 , d ) :
                                    for i5 in range ( 0 , d ) :
                                        for i5 in range ( 0 , d ) :
                                            for i5 in range ( 0 , d ) :
                                                for i5 in range ( 0 , d ) :
                                                    for i5 in range ( 0 , d ) :
                                                        for i5 in range ( 0 , d ) :
                                                            for i5 in range ( 0 , d ) :
                                                                for i5 in range ( 0 , d ) :
                                                                    ans = ( ans + score ( self.poly , i5 ) ) % 10009
return Alpha ( )
