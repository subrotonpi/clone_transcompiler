def fun1 ( s , t ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , s , t ) :
            self.s = s
            self.t = t
            self.d = True
            self.e = False
            self.r = True
        def call ( self , * args ) :
            charlist = [ 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ]
            i = len ( self.s )
            for n in i :
                d = False
                if self.s [ n ] != t [ n ] :
                    if self.s [ n ] != '@' and self.t [ n ] != '@' :
                        return 0
                    elif self.s [ n ] == '@' and self.t [ n ] != '@' :
                        for target in charlist :
                            if self.t [ n ] == target :
                                d = True
                                break
                        if d == False :
                            return 0
                    elif self.s [ n ] != '@' and self.t [ n ] == '@' :
                        for target in charlist :
                            if self.s [ n ] == target :
                                d = True
                                break
                        if d == False :
                            return 0
        return 1
    def fun2 ( self , * args ) :
        sc = sys.stdin
        s = sc.read ( )
        t = sc.read ( )
        result = fun2 ( s , t )
        if result == 0 :
            print ( "You will lose" )
        else :
            print ( "You can win" )
    return 0
