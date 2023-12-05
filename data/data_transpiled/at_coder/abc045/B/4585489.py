def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = ''
            self.b = ''
            self.c = ''
        def __call__ ( self , * args ) :
            sc = open ( self.a , 'r' )
            a = sc.read ( )
            self.b = sc.read ( )
            self.c = sc.read ( )
            ac = a [ 0 ]
            ans = 0
            if ac == 'a' :
                ans = DisCard ( 1 )
            elif ac == 'b' :
                ans = DisCard ( 2 )
            else :
                ans = DisCard ( 3 )
            answ = ''
            if ans == 1 :
                answ = 'A'
            elif ans == 2 :
                answ = 'B'
            else :
                answ = 'C'
            print ( answ )
            self.ans = ans
        def DisCard ( self , player ) :
            if player == 1 :
                if len ( self.a ) == 0 :
                    return 1
                else :
                    c = self.a [ 0 ]
                    self.a = a [ 1 : ]
                    if c == 'a' :
                        return DisCard ( 1 )
                    elif c == 'b' :
                        return DisCard ( 2 )
                    else :
                        return DisCard ( 3 )
            elif player == 2 :
                if len ( self.b ) == 0 :
                    return 2
                else :
                    c = self.b [ 0 ]
                    self.b = b [ 1 : ]
                    if c == 'a' :
                        return DisCard ( 1 )
                    elif c == 'b' :
                        return DisCard ( 2 )
                    else :
                        return DisCard ( 3 )
            else :
                if len ( self.c ) == 0 :
                    return 3
                else :
                    cha = self.c [ 0 ]
                    self.c = c [ 1 : ]
                    if cha == 'a' :
                        return DisCard ( 1 )
                    elif cha == 'b' :
                        return DisCard ( 2 )
                    else :
                        return DisCard ( 3 )
                