def import import _import_module
from _import_module import module_has_submodule
from _import_module import module_has_submodule
from _import_module import _import_module
from _module_has_submodule import module_has_submodule
class Main ( object ) :
    def __init__ ( self ) :
        self.__dict__ [ '__module__' ] = module_has_submodule
    def __getattr__ ( self , attr ) :
        return getattr ( self , attr )
    def __getitem__ ( self , item ) :
        return getattr ( self , item )
    def __setitem__ ( self , item , value ) :
        self.__dict__ [ '__module__' ] = item
    def __iter__ ( self ) :
        return iter ( self )
