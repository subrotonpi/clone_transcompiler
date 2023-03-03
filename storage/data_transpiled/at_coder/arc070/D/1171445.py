def _import ( ) :
    from itertools import chain
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.A = chain ( )
            self.B = chain ( )
            if A <= B :
                print ( "Impossible" )
                return
            stack = chain ( [ 0 ] , [ ] )
            Asz = A
            Bsz = B
            for i in range ( 1 , Bsz + 1 ) :
                if not stack :
                    print ( "? %s %d" % ( stack [ 0 ] , i ) )
                else :
                    stack.append ( i )
                    continue
                s = next ( iter ( stack [ 0 ] ) )
                if s == "Y" :
                    stack.append ( i )
                else :
                    del Bsz
                    stack.pop ( )
            ori = stack [ 0 ]
            be_honest = [ True ] * ( A + B )
            for i in range ( A + B ) :
                if i == ori :
                    continue
                print ( "? %s %d" % ( ori , i ) )
                s = next ( iter ( stack [ 0 ] ) )
                if s == "Y" :
                    be_honest [ i ] = True
            ans = [ ]
            for i in range ( A + B ) :
                if be_honest [ i ] :
                    ans.append ( "1" )
                else :
                    ans.append ( "0" )
            print ( "! " + ", ".join ( ans ) )
        def tr ( self , * args ) :
            print ( " ".join ( args ) )
