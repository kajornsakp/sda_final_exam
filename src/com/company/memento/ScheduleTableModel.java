package com.company.memento;




import java.util.ArrayList;
import java.util.List;
import javax.swing.table.*;

public class ScheduleTableModel extends DefaultTableModel {
    
    class TableMemento implements java.io.Serializable {

        private List columnIdentifiers;
        private List dataList;

        // Package visibility to only allow access for
        // the Originator.
        // We receive from the TableModel:
        // - a List of column identifiers
        // - a List of Lists of Object values (assumption: Strings)

        TableMemento(ArrayList columnIdentifiers, ArrayList dataList)
        {
            // COMPLETE.
            this.columnIdentifiers = columnIdentifiers;
            this.dataList = dataList;

        }


        // Package visibility to only allow access for
        // the Originator.
        ArrayList getColumnIdentifiers()
        {
            // COMPLETE.
            return (ArrayList)this.columnIdentifiers;
        }

        ArrayList getDataVector()
        {
            // COMPLETE.
            return (ArrayList)this.dataList;

        }

        @Override
        public String toString() {
            return "[ci=" + columnIdentifiers.toString() + "\n" +
                "dl=" + dataList.toString() + "]";
        }

        // Other private (static) helper methods.
        // COMPLETE if necessary.

    }

    // DefaultTableModel uses:
    // - a list of column identifiers
    // - a list of lists of Object values
    // This fact is reflected by the Memento class.
    public TableMemento state;

    public ScheduleTableModel(Object[][] data, Object[] columnNames)
    {
	super(data, columnNames);
        this.state = this.createMemento();
    }

    public TableMemento createMemento()
    {
	// COMPLETE.
        return new TableMemento(new ArrayList<Object>(this.columnIdentifiers), new ArrayList<Object>(this.dataVector));
    }

    public void setMemento(TableMemento memento)
    {
	// COMPLETE.
        this.state = memento;
    }
    
    public TableMemento getMemento(){
        return this.state;
    }
    
    

    
    
    
}
