package com.Example.sqlite_project.Features.SubjectCRUD.UpdateSubjectInfo;

import com.Example.sqlite_project.Features.SubjectCRUD.CreateSubject.Subject;

public interface SubjectUpdateListener {
    void onSubjectInfoUpdate(Subject subject, int position);
}
