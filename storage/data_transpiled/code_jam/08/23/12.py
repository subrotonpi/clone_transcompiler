def common ( filename ) :
    import os
    import os
    import os
    import os
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class Helper :
        def get_all_file_content_as_tuple ( self , filename ) :
            f = open ( filename , 'r' )
            all = [ ]
            s = f.readline ( )
            while s :
                all.append ( s )
                s = f.readline ( )
            f.close ( )
            return all
        def write_data ( self , cont , filename ) :
            f = open ( filename , 'w' )
            f.close ( )
            with open ( filename , 'w' , encoding = 'utf-8' ) as w :
                for s in cont :
                    w.write ( s + '\n' )
        def get_integers_from_string ( self , s ) :
            a = [ ]
            for se in s.split ( ) :
                try :
                    x = int ( se )
                    a.append ( x )
                except :
                    pass
            ret = [ ]
            for i in a :
                ret.append ( i [ 0 ] )
            return ret
    class Helper ( object ) :
        pass
    return Helper ( )
