def qualifiers ( ) :
    import re
    import sys
    import sys
    class AlienLanguage ( object ) :
        def match ( self , L , d , word_regex ) :
            tokens = [ ]
            idx = 0
            for tok in word_regex :
                tok = ""
                cur = tok
                if cur == "(" :
                    tok += cur
                    j = i + 1
                    for _ in range ( len ( word_regex ) ) :
                        tok += word_regex [ j ]
                    i = j
                elif cur == ")" :
                    i += 1
                    continue
                else :
                    tok += cur
                    i += 1
                tokens.append ( tok )
            ret = 0
            for i in range ( len ( d ) ) :
                cur = d [ i ]
                found = True
                for tok in cur :
                    if tok.find ( tok ) < 0 :
                        found = False
                        break
                if found :
                    ret += 1
            return ret
    def main ( ) :
        obj = AlienLanguage ( )
        f = sys.stdin
        t = f.readline ( )
        tok = t.split ( )
        L = int ( tok [ 0 ] )
        D = int ( tok [ 1 ] )
        N = int ( tok [ 2 ] )
        d = [ ]
        for i in range ( D ) :
            d.append ( f.readline ( ) )
        for i in range ( 1 , N + 1 ) :
            w = f.readline ( )
            ret = obj ( L , d , w )
            print ( "Case #%d: %d" % ( i , ret ) )
    return main
