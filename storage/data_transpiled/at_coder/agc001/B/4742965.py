def import _cal
class Main ( object ) :
    def __init__ ( self ) :
        with self.open ( '/proc/self/stat' ) as sc :
            num = sc.read ( )
            start = sc.read ( )
            print ( num + cal ( start , num - start ) )
    def cal ( self , width , height ) :
        if width * height == 0 :
            return - max ( width , height )
        elif width == height :
            return width
        elif width > height :
            return width / height ** 2 + cal ( width % height , height )
        else :
            return height / width ** 2 + cal ( width , height % width )
