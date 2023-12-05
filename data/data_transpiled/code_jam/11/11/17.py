def jam2011 ( ) :
    import sys
    import tokenize
    import tokenize
    import os
    import sys
    import os
    import sys
    import tokenize
    import tokenize
    import tokenize
    import os
    import sys
    import tokenize
    import tokenize
    import tokenize
    class AA ( object ) :
        def __init__ ( self , input ) :
            self.input = input
            self.case = int ( input.strip ( ) )
            self.case = int ( input.strip ( ) )
            self.out_file = open ( sys.argv [ 1 ] , 'w' )
            for i in range ( 1 , self.cases + 1 ) :
                line_t = tokenize ( input.strip ( ) )
                n = int ( line_t [ 0 ] )
                pd = int ( line_t [ 1 ] )
                pg = int ( line_t [ 2 ] )
                out = None
                if pg == 0 :
                    out = pd == 0 and "Possible" or "Broken"
                elif pg == 100 :
                    out = pd == 100 and "Possible" or "Broken"
                else :
                    if n >= 100 :
                        out = "Possible"
                    else :
                        nnn = 100
                        while pd % 2 == 0 and nnn % 2 == 0 or pd % 5 == 0 and nnn % 5 == 0 :
                            if pd % 2 == 0 and nnn % 2 == 0 :
                                nnn /= 2
                                pd /= 2
                            if pd % 5 == 0 and nnn % 5 == 0 :
                                nnn /= 5
                                pd /= 5
                        out = "Possible" if nnn <= n :
                            out = "Broken" if nnn <= n else "Broken"
            self.out_file.write ( "Case #%d: %s\n" % ( self.case , self.out ) )
    return AA
