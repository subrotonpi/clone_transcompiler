def _ import * SPACETOKEN from SPACETOKEN a SPACETOKEN file SPACETOKEN import SPACETOKEN * SPACETOKEN as SPACETOKEN file STRNEWLINE STRNEWLINE import SPACETOKEN sys STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE class SPACETOKEN A ( object ) : STRNEWLINE SPACETOKEN pass STRNEWLINE STRNEWLINE """
class Dir ( object ) :
    def __init__ ( self , name ) :
        self.name = name
        self.sub_dir = [ ]
    def mksub ( self , name ) :
        for d in self.sub_dir :
            if d.name == name :
                return 0
            self.sub_dir.append ( ( name , d ) )
        return 1
    def searchdir ( self ) :
        for d in self.sub_dir :
            if d.name == name :
                return d
        return None
    def mkpath ( self ) :
        for path in self.path :
            path = os.