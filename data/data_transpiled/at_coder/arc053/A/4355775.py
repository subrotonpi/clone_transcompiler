def import import sys , os , sys , shutil
from numpy.distutils.misc_util import get_info
import numpy
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        h , w = os.environ.get ( 'LINES' , 25 ) , os.environ.get ( 'COLUMNS' , 80 )
        self.out.write ( ( h - 1 ) * w + h * ( w - 1 ) )
