def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.x = [ ]
        self.count = 0
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            self.n = f.read ( )
    def main ( self , args ) :
        self.input ( )
        for i in range ( self.n ) :
            if 'x' in self.x :
                j = 0
                while self.x.find ( 'x' , j ) != - 1 :
                    j = self.x.find ( 'x' , j ) + 1
                    self.count += 1
        flag = True
        for i in range ( 9 ) :
            for j in range ( self.n ) :
                if self.x [ j ] == 'o' :
                    if flag :
                        self.count += 1
                        flag = False
                else :
                    flag = True
                flag = True
        print ( self.count )
