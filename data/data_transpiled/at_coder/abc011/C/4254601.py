def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = None
            self.ng1 = None
            self.ng2 = None
            self.ng3 = None
        def __call__ ( self , * args ) :
            try :
                with open ( self.filename ) as f :
                    n = f.read ( )
            except IOError :
                n = None
            ng1 = n
            ng2 = n
            ng3 = n
    if n == ng1 or n == ng2 or n == ng3 :
        ans = "NO"
    else :
        for i in range ( 100 ) :
            if n - 3 not in [ ng1 , ng2 , ng3 ] :
                n -= 3
            elif n - 2 not in [ ng1 , ng2 , ng3 ] :
                n -= 2
            elif n - 1 not in [ ng1 , ng2 , ng3 ] :
                n -= 1
            else :
                ans = "NO"
                break
        if n > 0 :
            ans = "NO"
        else :
            ans = "YES"
    print ( ans )
