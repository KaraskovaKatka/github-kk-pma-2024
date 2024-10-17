studentka: Kateřina karásková
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical"

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:inputType="text"
            android:id="@+id/jmeno_hrace"
            android:hint="Jméno hráče"
            android:layout_weight="1"/>

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:id="@+id/jmeno_klubu"
        android:hint="Jméno klubu"
        android:layout_weight="1" />






    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Český svaz xxx!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</LinearLayout>