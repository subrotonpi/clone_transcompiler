def _ ( ) : return 'Y'
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        def pln ( val ) :
            print ( '?' , end = ' ' )
            print ( val )
            return self.get ( )
        def get ( self ) :
            return sc.get ( )
        def solve ( self ) :
            num = 1000000000
            if self.pln ( num ) :
                num2 = 9
                num = 1
                while True :
                    if self.pln ( num2 ) :
                        break
                    num *= 10
                    num2 = ( num2 * 10 ) + 9
                print ( '! ' , num )
            else :
                digit = 9
                while digit > 1 :
                    num /= 10
                    if self.pln ( num ) :
                        break
                    digit -= 1
                ans = 0
                for i in range ( digit - 1 ) :
                    if self.pln ( ans * 10 + 5 ) :
                        if self.pln ( ans * 10 + 7 ) :
                            if self.pln ( ans * 10 + 8 ) :
                                if self.pln ( ans * 10 + 9 ) :
                                    ans = ans * 10 + 9
                                else :
                                    ans = ans * 10 + 8
                            else :
                                ans = ans * 10 + 7
                        else :
                            if self.pln ( ans * 10 + 6 ) :
                                ans = ans * 10 + 6
                            else :
                                ans = ans * 10 + 5
                    else :
                        if self.pln ( ans * 10 + 3 ) :
                            if self.pln ( ans * 10 + 4 ) :
                                ans = ans * 10 + 4
                            else :
                                ans = ans * 10 + 3
                        else :
                            if self.pln ( ans * 10 + 2 ) :
                                ans = ans * 10 + 2
                            else :
                                if self.pln ( ans * 10 + 1 ) :
                                    ans = ans * 10 + 1
                                else :
                                    ans = ans * 10 + 0
        if not self.pln ( ) :
            print ( ' !