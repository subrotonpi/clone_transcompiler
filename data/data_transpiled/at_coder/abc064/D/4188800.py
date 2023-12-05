def import sys , string , traceback ;
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.s = string
        self.s = [ ]
        self.left = 0
        self.right = 0
        for i in s :
            if i == '(' :
                self.left += 1
            else :
                self.right += 1
                if self.left > 0 :
                    self.right -= 1
                    self.left -= 1
        for i in range ( self.left ) :
            self.left += i
        for i in range ( self.right ) :
            self.left.insert ( 0 , '(' )
        print ( '\n'.join ( self.s ) )
